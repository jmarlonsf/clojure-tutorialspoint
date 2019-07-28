(ns examples.loops
  (:gen-class))

(defn while-example []
  (println (str "while"))
  (def x (atom 1))
  (while ( < @x 5 )
    (do
      (println @x)
      (swap! x inc))))
(while-example)

(defn doseq-example []
  (println (str "doseq"))
  (doseq [n [0 1 2]]
    (println n)))
(doseq-example)

(defn dotimes-example []
  (println (str "dotimes"))
  (dotimes [n 5]
    (println n)))
(dotimes-example)

(defn loop-example []
  (println (str "loop"))
  (loop [x 10]
    (when (> x 1)
      (println x)
      (recur (- x 2)))))
(loop-example)