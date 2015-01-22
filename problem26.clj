(fn [x]
  (take x
    ((fn fib [a b]
     (cons a (lazy-seq (fib b (+ a b)))))
   1 1)))
