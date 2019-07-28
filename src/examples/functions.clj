; https://www.tutorialspoint.com/clojure/clojure_higher_order_functions.htm
(ns examples.functions
  (:gen-class))

; Defining a Function: A function is defined by using the ‘defn’ macro.
;(defn functionname
;  “optional documentation string”
;  [arguments]
;  (code block))

; Anonymous Functions: An anonymous function is a function which has no name associated with it.
(defn anonymous-example []
  ((fn [x] (* 2 x)) 2))
(anonymous-example)

; Functions with Multiple Arguments: Clojure functions can be defined with zero or more parameters.
; The values you pass to functions are called arguments, and the arguments can be of any type.
(defn demo [] (* 2 2))
(defn demo [x] (* 2 x))
(defn demo [x y] (* 2 x y))

; Variadic Functions: Clojure offers the ‘case’ statement which is similar
; to the ‘switch’ statement available in the Java programming language.
(defn demo
  [message & others]
  (str message (clojure.string/join " " others)))
(println (demo "Hello" "This" "is" "the" "message"))

; Higher Order Functions: Higher-order functions (HOFs) are functions that take other functions as arguments.
(println (filter even? (range 0 10)))