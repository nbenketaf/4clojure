;; Global take-while
(fn f [n p [x & xs]]
  (let [n (if (p x) (dec n) n)]
    (when (> n 0)
      (cons x (f n p xs)))))

;; Brilliant solution from maximental
(fn [n p s]
  (take (last (take n (keep-indexed #(if (p %2) %) s))) s))
