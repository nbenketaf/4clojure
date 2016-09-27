;; Longest increasing seq
(defn linc-seq [s] 
  (let [m (reduce 
            #(let [idx (:idx %)
                   xs (% idx) 
                   x (last xs)]
               (if (= x (dec %2))
                 (assoc % idx (conj xs %2))
                 (merge % {:idx (inc idx)} {(inc idx) [%2]})))
            {:idx 0 0 [(first s)]} (rest s))
        n (dissoc m :idx)
        c (apply max (map count (vals n)))
        l (filter #(= c (count (val %))) n)
        i (apply min (map first l))
        r (n i)]
    (if (and (> c 1) r) r [])))

;; Much more functional solution
(fn [s] 
  (->> s
       (reductions #(if (= (dec %2)(last %))
                      (conj % %2)
                      [%2]) [])
       (filter #(< 1 (count %)))
       (apply max-key key [])))

;; Nice solution from Ofournier :-)
(fn [l]
  (->> l
       (map #(list (- %2 %) %2) (range))
       (partition-by first)
       (filter #(< 1 (count %)))
       (apply max-key count [])
       (map second)))
