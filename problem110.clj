;; Sequence of pronunciations
(comp next iterate) (comp 
                      (partial mapcat (juxt count first)) 
                      (partial partition-by identity))
