;; Filter Perfect Squares
(fn [s]
  (->> (read-string (str "("s")"))
       (filter #(let [s (int (Math/sqrt %))] (= (* s s) %)))
       (interpose \,)
       (apply str)))
