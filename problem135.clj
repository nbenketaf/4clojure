;; Infix calculator
(fn inf [x op y & z] 
  (if z
    (apply inf (op x y) z)
    (op x y)))

;; Without recursion
(fn [x & xs]
  (reduce (fn [x [op y]] (op x y)) x (partition 2 xs)))
