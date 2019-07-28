; https://www.tutorialspoint.com/clojure/clojure_data_types.htm
(ns examples.datatypes
  (:gen-class))

;This program display Hello World
(defn Example []
  ;the below code declares a integer variable
  (def x 1)

  ;the below code declares a float variable
  (def y 1.25)

  ;the below code declares a string variable
  (def str1 "Hello")

  ;the below code declares a boolean variable
  (def status true)
  (def STATUS false)

  (println x)
  (println y)
  (println str1)
  (println status)
  (println STATUS))
(Example)
