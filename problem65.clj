;; Black Box Testing
#(or ({{} :map #{} :set} (empty %))
     (if (= 1 ((comp first conj) (empty %) 1 2)) 
       :vector 
       :list))
