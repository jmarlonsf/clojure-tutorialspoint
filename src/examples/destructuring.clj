(ns examples.destructuring
  (:gen-class))

(defn Example []
  (def my-vector [1 2 3 4])
  (let [[a b c d] my-vector]
    (println a b c d)))
(Example)

(defn Example []
  (def my-vector [1 2 3 4])
  (let [[a b c d e] my-vector]
    (println a b c d e)))
(Example)

;the-rest
(defn Example []
  (def my-vector [1 2 3 4])
  (let [[a b & the-rest] my-vector]
    (println a b the-rest)))
(Example)

;Destructuring Maps
(defn Example []
  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b"} my-map]
    (println a b)))
(Example)

(defn Example []
  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b" c "c"} my-map]
    (println a b c)))
(Example)