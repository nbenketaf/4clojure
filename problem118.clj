(fn my-map [f coll] 
 (when-let [s (seq coll)] 
  (lazy-seq (cons (f (first s)) (my-map f (rest s))))))

;; With for, rings the bell
#(for [x (seq %2)] (%1 x))
