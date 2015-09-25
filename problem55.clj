#(reduce (fn [occurences x] (assoc occurences x (inc (get occurences x 0)))) {} %)
