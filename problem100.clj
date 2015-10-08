;; LCM
(fn [& xs]
  (/ (apply * xs)
     (reduce #(if (zero? %2) % (recur %2 (mod % %2))) xs)))

;; Again, from cgrand
(fn [n & ns]
  (first
    (for [m (next (range))
          :let [n (* n m)]
          :when (every? #(zero? (mod n %)) ns)] n)))
