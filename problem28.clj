;; Flatten a Sequence
(fn [coll] 
  (seq (reduce (fn f [x y] (if (coll? y) (reduce f x y) (conj x y))) [] coll)))

;; A less verbose version
(fn f [x] (if (coll? x) (mapcat f x) [x]))
