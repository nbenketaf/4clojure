;; Beauty is Symmetry
#(= % 
    ((fn _ [[n l r]] 
       (if n [n (_ r) (_ l)])) %))

;; More verbose solution
(fn [[root l r]]
  (letfn [(mir? [a b]
                (cond
                 (not= (coll? a) (coll? b)) false
                 (coll? a) (let [[rta la ra] a
                                 [rtb lb rb] b]
                             (and (= rta rtb) (mir? la rb) (mir? ra lb)))
                 :else (= a b)))]
    (mir? l r)))
