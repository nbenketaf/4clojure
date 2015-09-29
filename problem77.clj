(fn [coll]
  (into #{}
        (->> coll
             (group-by sort)
             (map val)
             (filter #(> (count %) 1))
             (map set))))
