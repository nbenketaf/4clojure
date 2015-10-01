;; Juxtaposition
(fn [& fs]
  #(for [f fs] (apply f %&)))

;; Reduce variant
(fn [f & fs]
  (fn [& args] 
    (reduce #(conj % (apply %2 args)) [(apply f args)] fs)))

;; Map variant
(fn [& fs]
  (fn [& args]
    (map #(apply % args) fs)))
