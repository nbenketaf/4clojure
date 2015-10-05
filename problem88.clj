;; Symetric difference
#(concat (filter (complement %2) %) (filter (complement %) %2))

;; Using fn remove from cgrand, exactly what I was looking for
#(set (concat (remove % %2) (remove %2 %)))
