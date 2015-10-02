;; Intersection
#(set (for [x %1 :when (contains? %2 x)] x))

;; Using filter and the fact that a set is a function
#(set (filter %2 %))

;; Using comp from cgrand
(comp set filter)
