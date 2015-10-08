;; Recognize Playing Cards
(fn [[s r]]
  {:suit ({\S :spade \D :diamond \H :heart \C :club} s)
  :rank ((zipmap "23456790TJQKA" (range)) r)})
