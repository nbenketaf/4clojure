;; pgcd
#(if (zero? %2) % (recur %2 (mod % %2)))
