(fn it [f x] (lazy-cat [x] (it f (f x))))

;; using lazy-seq
(fn it [f i] (lazy-seq (cons i (it f (f i)))))

;; using reductions from _pcl
(fn [f init] (reductions (fn [acc _] (f acc)) (repeat init)))
