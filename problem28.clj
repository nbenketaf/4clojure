;; Flatten a Sequence
(fn [coll] 
  (seq (reduce (fn f [x y] (if (coll? y) (reduce f x y) (conj x y))) [] coll)))
