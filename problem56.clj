reduce (fn [coll x] (if (some #(= x %) coll) coll (conj coll x))) []

;; Nice solution from maximental
reduce #({%2 %} ((set %) %2) (conj % %2)) [] 
