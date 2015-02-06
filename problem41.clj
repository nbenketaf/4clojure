;; Drop every nth element
(fn [coll n]
  (mapcat #(take (dec n) %) (partition-all n coll)))

;; Variant
(fn [coll n] 
  (mapcat 
    #(if (= 0 (mod (count %) n)) 
       (drop-last %) 
       (identity %)) 
    (partition-all n coll)))
