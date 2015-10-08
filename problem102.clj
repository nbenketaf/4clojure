;; toCamelCase
#(clojure.string/replace % #"-\w" (fn [[_ c]] 
                                    (clojure.string/upper-case c)))

;; Using re-seq
#(apply str 
       (map 
         (fn [[a b]] 
           (if b (Character/toUpperCase b) a)) 
         (re-seq #"-?." %)))
