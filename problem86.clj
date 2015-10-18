;; Happy numbers
(fn [n]
  (loop [n n s #{}]
    (cond
     (= n 1) true
     (s n) false
     :else (recur (reduce + (map (comp #(* % %) read-string str) (str n))) (conj s n)))))
