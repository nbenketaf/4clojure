;; Reverse interleave
#(partition (/ (count %1) %2) (apply interleave (partition %2 %1)))

;; Much more elegant solution
#(apply map list (partition %2 %1))
