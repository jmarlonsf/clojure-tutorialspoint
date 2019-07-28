;https://www.tutorialspoint.com/clojure/clojure_vectorof.htm
(ns examples.vectors
  (:require [clojure.set :as set])
  (:gen-class))

(defn example []
  (println (vector 1 2 3)))
(example)

;1	vector-of
;Creates a new vector of a single primitive type ‘t’, where ‘t’ is one of :int :long :float :double :byte :short :char or :boolean.
(defn example []
  (println (vector-of :int 1 2 3)))
(example)

;2	nth
;This function returns the item in the nth position in the vector.
(defn example []
  (println (nth (vector 1 2,3) 0))
  (println (nth (vector 1 2,3) 2)))
(example)

;3	get
;Returns the element at the index position in the vector.
(defn example []
  (println (get (vector 3 2 1) 2))
  (println (get (vector 3 2 1) 1)))
(example)

;4	conj
;Appends an element to the vector and returns the new set of vector elements.
(defn example []
  (println (conj (vector 3 2 1) 5)))
(example)

;5	pop
;For a list or queue, returns a new list/queue without the first item, for a vector, returns a new vector without the last item.
(defn example []
  (println (pop (vector 3 2 1))))
(example)

;6	subvec
;Returns a sub vector from a starting and ending index.
(defn example []
  (println (subvec (vector 1 2 3 4 5 6 7) 2 5)))
(example)