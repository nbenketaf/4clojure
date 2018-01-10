;; Euler totient function

(fn phi [x]
  (let [gcd #(if (zero? %2) % (recur %2 (mod % %2)))]
   (->> (range x)
        (filter #(= 1 (gcd % x)))
        count)))

