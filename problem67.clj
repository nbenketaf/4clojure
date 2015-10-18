;; Prime numbers
(fn [n]
  (letfn [(sieve [s]
                 (lazy-seq (cons (first s) (sieve (filter #(not= 0 (mod % (first s))) (rest s))))))]
    (take n (sieve (iterate inc 2)))))
