(fn [f coll]
  (reduce (fn [m x]
            (let [k (f x)]
              (assoc m k (conj (get m k []) x)))) {} coll))

;; Brilliant solution from dzholev
(fn [f coll]
  (reduce #(merge-with into %1 {(f %2) [%2]}) {} coll))
