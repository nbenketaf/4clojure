;; Rotate a sequence
#(flatten (reverse (split-at (mod %1 (count %2)) %2)))

;; Using -> macro
#(->
  (split-at (mod %1 (count %2)) %2)
  reverse
  flatten
  )
