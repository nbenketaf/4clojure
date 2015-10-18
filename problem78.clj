;; Reimplement trampoline
#(if (fn? %) (recur (apply % %&) ()) %)

;; Classic one
(fn t
  ([f]
   (let [r (f)]
     (if (fn? r)
       (recur r)
       r)))
  ([f & xs]
   (t #(apply f xs))))
