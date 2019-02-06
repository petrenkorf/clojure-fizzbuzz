(ns fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (and (= 0 (mod n 5)) (= 0 (mod n 3))) "FizzBuzz"
    (= 0 (mod n 3))      "Fizz"
    (= 0 (mod n 5))      "Buzz"
    :else n))

(defn main
  "I don't do a whole lot."
  [x]
  (println (map fizzbuzz (range (Integer/parseInt x)))))
