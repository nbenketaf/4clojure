;; Sum of square of digits
(fn [xs] 
  (count (filter (fn [x] (< x (reduce + (map (comp #(* % %) read-string str) (str x))))) xs)))

;; From cgrand
reduce
#(if (< %2 (reduce + 
  (map (zipmap "0123456789" (map * (range) (range)))
    (str %2)))) (inc %) %) 0
