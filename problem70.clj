(fn [s] (sort-by #(.toLowerCase %) (re-seq #"\w+" s)))

;; Variant using full clojure
#(sort-by clojure.string/lower-case (re-seq #"\w+" %))
