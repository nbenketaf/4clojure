;; First ugly solution
(defn my-comp [& fns]
  (fn [& args]
    (loop [[head & tail] (reverse fns)
           acc (apply head args)]
      (if (not-empty tail)
        (recur tail ((first tail) acc))
        acc))))

;; More functional one
(fn [& fs]
  (fn [& args]
    (reduce #(%2 %) (apply (last fs) args) (rest (reverse fs)))))

;; Nice one
(fn cmp [f & fs]
  (if fs
      #(f (apply (apply cmp fs) %&))
      f))
