;; Simple closures
(fn [n] #(reduce * (repeat n %)))

;; Using partial
partial #(reduce * (repeat % %2))

;; Using java interop Math/pow
partial #(Math/pow %2 %1)
