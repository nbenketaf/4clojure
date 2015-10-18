;; Triangle Minimum Path
(fn f [[[h] & t]]
  (if h
    (+ h (min
          (f (map rest t))
          (f (map butlast t))))
    0))

;; Using partition + reverse
(comp first 
      (partial reduce #(map + %2 (map (partial apply min) (partition 2 1 %))))
      reverse)

;; more verbose one
(fn [t]
 (->> [[0]]
      (iterate (fn [n] (mapcat #(vector (conj % (last %)) (conj % (inc (last %)))) n)))
      (take (count t))
      last
      (map (fn [n] (map #(nth % %2) t n)))
      (map (partial apply +))
      (apply min)))
