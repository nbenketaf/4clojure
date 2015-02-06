;; Get the Caps
(fn [s] (apply str (re-seq #"[A-Z]" s)))
