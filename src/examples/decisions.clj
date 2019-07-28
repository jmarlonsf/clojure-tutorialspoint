; https://www.tutorialspoint.com/clojure/clojure_decision_making.htm
(ns examples.decisions
  (:gen-class))

; if statement
(defn if-example []
  (if (= 2 2)
    (println "Values are equal")
    (println "Values are not equal")))
(if-example)

; if/do statement
(defn if-do-example []
  (if (= 2 2)
    (do
      (println "Both the values are equal")
      (println "true"))
    (do
      (println "Both the values are not equal")
      (println "false"))))
(if-do-example)

; nested if statements
(defn if-nested-example []
  (if ( and (= 2 2) (= 3 3))
    (println "Values are equal")
    (println "Values are not equal")))
(if-nested-example)

; case statement
(defn case-example []
  (def x 8)
  (case x 5 (println "x is 5")
          10 (println "x is 10")
          (println "x is neither 5 nor 10")))
(case-example)

; cond statement
(defn cond-example []
  (def x 5)
  (cond
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    :else (println "x is not defined")))
(cond-example)