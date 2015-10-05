;; Pascal's Trapezoid
(fn p [coll] 
  (->> (last coll)
       (conj (reduce #(conj % (apply +' %2)) [] (partition 2 1 coll)))
       (cons (first coll))
       p lazy-seq
       (cons coll)))

;; Beautiful one from cgrand
iterate #(mapv +' (conj % 0) (cons 0 %))
