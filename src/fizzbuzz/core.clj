(ns fizzbuzz.core)

(defn fizzbuzz [n]
  (cond-> nil
    (zero? (mod n 3)) (str "Fizz")
    (zero? (mod n 5)) (str "Buzz")
    :always (or (str n))))

(defn main
  "I don't do a whole lot."
  [x]
  (println (map fizzbuzz (range (Integer/parseInt x)))))
