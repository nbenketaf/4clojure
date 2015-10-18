;; Interpose a seq
;; Restriction : interpose
(fn [sep coll] (drop-last (mapcat vector coll (repeat sep))))

;; Using interleave
#(next (interleave (repeat %) %2))
