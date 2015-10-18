;; Decurry
(fn [f]
  (fn [& xs]
    (reduce #(% %2) f xs)))
