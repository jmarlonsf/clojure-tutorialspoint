; https://www.tutorialspoint.com/clojure/clojure_operators.htm
(ns examples.operators
  (:gen-class))

(defn ArithmeticOperator []
  (println (str "ArithmeticOperator"))
  ;Addition of two operands
  (println (+ 1 2))

  ;Subtracts second operand from the first
  (println (- 2 1))

  ;Multiplication of both operands
  (println (* 2 2))

  ;Division of numerator by denominator
  (println (/ 2 2))

  ;Incremental operators used to increment the value of an operand by 1
  (println (inc 5))

  ;Incremental operators used to decrement the value of an operand by 1
  (println (dec 5))

  ;Returns the largest of its arguments
  (println (max 1 2 3 4 5))

  ;Returns the smallest of its arguments
  (println (min 1 2 3 4 5))

  ;Remainder of dividing the first number by the second
  (println (rem 3 2)))
(ArithmeticOperator)

(defn RelationalOperator []
  (println (str "RelationalOperator"))
  ;Tests the equality between two objects
  (println (= 2 2))

  ;Tests the difference between two objects
  (println (not= 2 2))

  ;Checks to see if the left object is less than the right operand
  (println (< 2 2))

  ;Checks to see if the left object is less than or equal to the right operand
  (println (<= 2 3))

  ;Checks to see if the left object is greater than the right operand
  (println (> 2 3))

  ;Checks to see if the left object is greater than or equal to the right operand
  (println (>= 3 3)))
(RelationalOperator)

(defn LogicalOperator []
  (println (str "LogicalOperator"))
  ;This is the logical “or” operator
  (def x (or true true))
  (println x)

  ;This is the logical “and” operator
  (def x (and true false))
  (println x)

  ;This is the logical “not” operator
  (def x (not true))
  (println x))
(LogicalOperator)

(defn BitwiseOperators []
  (println (str "BitwiseOperators"))
  ;This is the bitwise “and” operator
  (def x (bit-and 00111100 00001101))
  (println x)

  ;This is the bitwise “or” operator
  (def x (bit-or 00111100 00001101))
  (println x)
  ;This is the bitwise “xor” or Exclusive ‘or’ operator
  (def x (bit-xor 00111100 00001101))
  (println x)
  ;This is the bitwise negation operator)
(BitwiseOperators)