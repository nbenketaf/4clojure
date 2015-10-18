;; Intervals
(fn [v]
  (->> v distinct sort
       (map #(list %2 (- %2 %)) (range))
       (partition-by second)
       (map (juxt ffirst (comp first last)))))
