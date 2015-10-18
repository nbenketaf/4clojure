;; Oscilrate
(fn [x & fs]
  (reductions #(%2 %) x (cycle fs)))

;; Using iterate
(fn [i & fs]
  (map first (iterate (fn [[j [f & gs]]] [(f j) gs]) [i (cycle fs)])))
