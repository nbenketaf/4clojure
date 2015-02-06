;; Interleave two seqs
(fn [coll1 coll2] (mapcat #(cons %1 (cons %2 '())) coll1 coll2))

;; Using vector
#(mapcat vector %1 %2)
