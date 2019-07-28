; https://www.tutorialspoint.com/clojure/clojure_numbers.htm
(ns examples.numbers
  (:gen-class))

; Following is an example of numbers in Clojure.
(def x 5)
(def y 5.25)
(println (type x))
(println (type y))

;1	zero?
;Returns true if the number is zero, else false.
(defn zero-example []
  (println "zero-example {}")
  (def x (zero? 0))
  (println x)

  (def x (zero? 0.0))
  (println x)

  (def x (zero? 1))
  (println x))
(zero-example)

;2	pos?
;Returns true if number is greater than zero, else false.
(defn pos-example []
  (println "pos-example {}")
  (def x (pos? 0))
  (println x)

  (def x (pos? -1))
  (println x)

  (def x (pos? 1))
  (println x))
(pos-example)

;3	neg?
;Returns true if number is less than zero, else false.
(defn neg-example []
  (println "neg-example")
  (def x (neg? -1))
  (println x)

  (def x (neg? 0))
  (println x)

  (def x (neg? 1))
  (println x))
(neg-example)

;4	even? [par]
;Returns true if the number is even, and throws an exception if the number is not an integer.
(defn even-example []
  (println "even-example")
  (def x (even? 0))
  (println x)

  (def x (even? 2))
  (println x)

  (def x (even? 3))
  (println x))
(even-example)

;5	odd? [impar]
;Returns true if the number is odd, and throws an exception if the number is not an integer.
(defn odd-example []
  (println "odd-example")
  (def x (odd? 0))
  (println x)

  (def x (odd? 2))
  (println x)

  (def x (odd? 3))
  (println x))
(odd-example)

;6	number?
;Returns true if the number is really a Number.
(defn number-example []
  (println "number-example")
  (def x (number? 0))
  (println x)

  (def x (number? 0.0))
  (println x)

  (def x (number? :a))
  (println x))
(number-example)

;7	integer?
;Returns true if the number is an integer.
(defn integer-example []
  (println "integer-example")
  (def x (integer? 0))
  (println x)

  (def x (integer? 0.0))
  (println x))
(integer-example)

;8	float?
;Returns true if the number is a float.
(defn float-example []
  (println "float-example")
  (def x (float? 0))
  (println x)

  (def x (float? 0.0))
  (println x))
(float-example)