; https://www.tutorialspoint.com/clojure/clojure_date_and_time.htm
(ns examples.date-time
  (:gen-class))

(defn Example []
  (def date (.toString (java.util.Date.)))
  (println date))
(Example)

(defn Example []
  (def date (.format (java.text.SimpleDateFormat. "dd/MM/yyyy") (new java.util.Date)))
  (println date))
(Example)

;(import java.util.Date)
(defn Example []
  (def date (.getTime (java.util.Date.)))
  (println date))
(Example)