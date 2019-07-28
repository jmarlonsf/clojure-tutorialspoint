; https://www.tutorialspoint.com/clojure/clojure_basic_syntax.htm
(ns examples.hello
  (:gen-class))

;;simple hello-world example
(defn hello-world []
  (println "Simple Hello world"))
(hello-world)

;;str concat strings
(defn Example1 []
  (println (str "Ex1: Hello world"))
  (println (+ 1 2)))
(Example1)
