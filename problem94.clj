;; Game of life
(fn [b]
  (let [w (range (count (first b)))
        h (range (count b))
        v (fn [[x y]]
            (for [dx [-1 0 1] dy (if (zero? dx) [-1 1] [-1 0 1])] 
              [(+ dx x) (+ dy y)]))]
    (->> b
         (#(set (for [x h y w
                      :when (= \# (get-in % [x y]))]
                  [x y])))
         (#(set (for [[l n] (frequencies (mapcat v %))
                    :when (or (= n 3) (and (= n 2) (% l)))]
                l)))
         (#(for [x h] (apply str (for [y w] (if (% [x y]) "#" " ")))))
         vec)))

;; Version 2
(fn [b]
  (letfn [(ln [x y]
             (->> (for [i [-1 0 1] j [-1 0 1] :when (not= 0 i j)]
                    (get-in b [(+ i x) (+ j y)]))
                  (filter #(= \# %)) count))]
    (->> (for [x (range (count b))
               y (range (count (first b)))]
           ({3 \# 2 (get-in b [x y])} (ln x y) " "))
         (partition (count b))
         (map #(apply str %)))))

;; Very nice one from ofournier

(letfn [(b [t]
          (->> (apply map #(map - (concat %& [0]) (concat [0 0 0] %&)) t)
               (map #(next (reductions + %)))))]
  (fn [t]
    (->> (map #(map {\  0 \# 1} %) t)
         b b
         (map (partial map #({3 "#" 4 %} %2 " ")) t)
         (map #(apply str %)))))
