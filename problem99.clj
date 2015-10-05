;; Product digits
(fn [& args] (map #(Character/digit % 10) (seq (str (reduce * args)))))

;; Without java interop
(fn [& args] (map #(- (int %) (int \0)) (str (apply * args))))

;; Using read-string
#(map (comp read-string str) (seq (str (apply * %&))))

;; Really nice one from cgrand (again :))
#(map (zipmap "0123456789" (range 10)) (str (apply * %&)))
