; https://www.tutorialspoint.com/clojure/clojure_recursion.htm
(ns examples.recursion
  (:gen-class))

(defn Example []
  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i)))))
(Example)
