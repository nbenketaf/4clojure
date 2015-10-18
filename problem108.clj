;; Lazy searching
#(let [l (sort-by first %&)]
   (if (apply = (map first l))
     (ffirst l)
     (recur (cons (next (first l)) (next l)))))
