;; Sequence reductions
(fn reds
  ([f coll]
   (lazy-seq (reds f (first coll) (rest coll))))
  ([f init coll]
   (cons init 
         (lazy-seq (when (not-empty coll)
                     (reds f (f init (first coll)) (rest coll)))))))
