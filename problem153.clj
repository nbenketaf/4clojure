;; Pairwise Disjoint Sets
#(every? empty? (for [x % y (disj % x)] (clojure.set/intersection x y)))

;; Using distinct? + concat
#(apply distinct? (apply concat %))

;; Using distinct? + seq
#(apply distinct? (mapcat seq %))
