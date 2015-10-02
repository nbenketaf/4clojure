;; Simple closures
(fn [n] #(reduce * (repeat n %)))

;; Using partial
partial #(reduce * (repeat % %2))
