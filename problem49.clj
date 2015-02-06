;; Split a sequence
(fn [n coll] (vector (take n coll) (drop n coll)))
