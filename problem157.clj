;; Indexing seqs
map-indexed (comp reverse vector)

;; Solution from _caterpillar
#(map vector % (range))

;; Solution from dzholev
map-indexed #(vector %2 %1)
