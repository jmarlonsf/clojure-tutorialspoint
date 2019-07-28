; https://www.tutorialspoint.com/clojure/clojure_metadata.htm
(ns examples.metadata
  (:gen-class))

;1	meta-with
;This function is used to define a metadata map for any object.
(defn Example []
  (def my-map (with-meta [1 2 3] {:prop "values"}))
  (println (meta my-map)))
(Example)

;2	meta
;This function is used to see if any metadata is associated with an object.
(defn Example []
  (def my-map (with-meta [1 2 3] {:prop "values"}))
  (println (meta my-map)))
(Example)

;3	vary-meta
;Returns an object of the same type and value as the original object, but with a combined metadata.
(defn Example []
  (def my-map (with-meta [1 2 3] {:prop "values"}))
  (println (meta my-map))
  (def new-map (vary-meta my-map assoc :newprop "new values"))
  (println (meta new-map)))
(Example)
