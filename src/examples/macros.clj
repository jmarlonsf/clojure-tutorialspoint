; https://www.tutorialspoint.com/clojure/clojure_macros.htm
(ns examples.macros
  (:gen-class))

;defmacro
;(defmacro name [params*] body)

(defn Example []
  (defmacro Simple []
    (println "Hello"))
  (macroexpand '(Simple)))
(Example)

;macro-expand
;(macroexpand macroname)
(defn Example []
  (defmacro Simple []
    (println "Hello"))
  (macroexpand '(Simple)))
(Example)

;Macro with Arguments
(defn Example []
  (defmacro Simple [arg]
    (list 2 arg))
  (println (macroexpand '(Simple 2))))
(Example)