;; Count Occurrences
reduce #(assoc % %2 (inc (% %2 0))) {}
