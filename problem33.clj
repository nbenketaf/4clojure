;; Relplicate a sequence
(fn [coll n] (mapcat #(repeat n %) coll))
