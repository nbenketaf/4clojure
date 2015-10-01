(fn part [n coll]
  (when (>= (count coll) n)
    (cons (take n coll) (part n (drop n coll)))))

;; Solution using split-at from awebb
(fn part [n coll]
  (let [[p r] (split-at n coll)]
    (when (= (count p) n) (cons p (part n r)))))

;; Really nice one from sheldon
(fn [n s] (filter #(<= n (count %)) (vals (group-by #(quot % n) s))))

;; Crazy one from cgrand...
#(take-nth % (apply map list (take % (iterate next %2))))
