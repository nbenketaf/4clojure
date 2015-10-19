;; Insert between two items
(fn [p v [h & t :as xs]]
  (when h
    (cons h 
          (mapcat 
           (fn [[x y]] (if (p x y) [v y] [y]))
           (partition 2 1 xs)))))
