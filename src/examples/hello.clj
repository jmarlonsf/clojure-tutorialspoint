(ns examples.hello
  (:gen-class))

;import clojure namespace
;(require 'clojure.java.io')

;;simple hello-world example
(defn hello-world []
  (println "Simple Hello world"))
(hello-world)

;;str concat strings
(defn Example1 []
  (println (str "Ex1: Hello world"))
  (println (+ 1 2)))
(Example1)
