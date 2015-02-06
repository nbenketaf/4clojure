;; Duplicate a sequence
(fn [coll] (mapcat #(repeat 2 %) coll))

;; Other solution
(fn [coll]
  (reverse
   (reduce #(cons %2 (cons %2 %1)) '() coll)))
