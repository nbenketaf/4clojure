;; Powerset
reduce (fn [s x]
         (into s (map #(conj % x) s)))
#{#{}}

;; More verbose one
(defn powerset [coll] 
  (reduce (fn [a x]
            (->> a
                 (map #(set (concat #{x} %)))
                 (concat a)
                 set))
          #{#{}} coll))
