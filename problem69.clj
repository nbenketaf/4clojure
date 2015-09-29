;; Merge with a function
(fn merge-maps [f & maps]
  (reduce 
    #(reduce 
       (fn [m [k v]] 
         (assoc m k (if (contains? m k) 
                      (f (get m k) v)
                      v))) 
       %1 
       %2)
    {}
    maps))

;; Solution from dzholev
(fn [f & s]
  (into {} 
        (for [[k v] (group-by first (apply concat (map vec s)))]
          	  [k (reduce f (map second v))])))
