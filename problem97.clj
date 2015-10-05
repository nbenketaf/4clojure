;; Pascal's Triangle
(fn [n] (nth (iterate #(mapv +' (conj % 0) (cons 0 %)) [1]) (dec n)))

;; Variant from cgrand
(fn [n]
  (nth (iterate #(concat [1] (map + % (next %)) [1]) [1]) (dec n)))
