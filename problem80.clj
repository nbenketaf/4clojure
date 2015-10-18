;; Perfect Numbers
(fn [n]
  (= n
     (->> (range 1 n)
          (filter #(zero? (mod n %)))
          (reduce +))))
