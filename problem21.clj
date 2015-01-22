;; Not working solution, fires the nth restriction bell !
(defn my-nth [coll idx]
  (loop [[head & tail] coll
         acc 0]
    (if (= idx acc)
      head
      (recur tail (inc acc)))))

;; Working solution
#(get (vec %1) %2)


