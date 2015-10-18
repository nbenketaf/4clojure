;; Analyse a Tic Tac Toe
#(->> (concat % (apply map vector %) (map (fn [d] (map get % d)) [[0 1 2] [2 1 0]]))
      (some {[:x :x :x] :x [:o :o :o] :o}))

;; First shot
(fn [b]
  (letfn [(cols [b] 
            ((juxt (partial map first) (partial map second) (partial map last)) b))
          (d1 [b]
            ((juxt ffirst (comp second second) (comp last last)) b))
          (d2 [b]
            ((juxt (comp last first) (comp second second) (comp first last)) b))]
    (->>
      (concat b (cols b) ((juxt d1 d2) b))
      (some {[:x :x :x] :x [:o :o :o] :o}))))

;; Very nice one from mouse
(fn [[[a b c] [d e f] [g h i] :as x]]
    (some {[:x :x :x] :x [:o :o :o] :o}
          (list* [a d g] [b e h] [c f i] [a e i] [c e g] x)))
