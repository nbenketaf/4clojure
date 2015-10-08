;; Identify keys and values
(fn f [coll]
  (loop [[x & s] coll
         res {}]
    (if (seq s)
      (let [[h t] (split-with (complement keyword?) s)]
	  	(recur t (merge res {x h})))
      res)))

;; Another brilliant solution from cgrand
(fn f [[x & s :as c]]
  (if (seq c)
   (let [[a b] (split-with number? s)]
     (merge {x a} (f b)))
   {}))
