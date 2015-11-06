;; Equivalence classes
#(->> (group-by % %2) vals (map set) set)

;; Using comp
(comp set (partial map set) vals group-by)
