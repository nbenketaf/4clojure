;; Interpose a seq
;; Restriction : interpose
(fn [sep coll] (drop-last (mapcat vector coll (repeat sep))))
