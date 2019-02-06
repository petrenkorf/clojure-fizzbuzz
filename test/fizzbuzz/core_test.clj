(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :as c]))

(deftest fizzbuzz
  (testing "Print fizz when number is divisible by 3"
    (is (= "Fizz" (c/fizzbuzz 3))))
  (testing "Return number when not visible by 3"
    (is (= 4 (c/fizzbuzz 4))))
  (testing "Print buzz when number is divisible by 5"
    (is (= "Buzz" (c/fizzbuzz 5))))
  (testing "Return number when not visible by 5"
    (is (= 7 (c/fizzbuzz 7))))
  (testing "Print fizzbuzz when number is divisible by 5 and by 3"
    (is (= "FizzBuzz" (c/fizzbuzz 15)))))
