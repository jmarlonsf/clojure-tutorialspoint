; https://www.tutorialspoint.com/clojure/clojure_sets.htm
(ns examples.sets
  (:require [clojure.set :as set])
  (:gen-class))

;1	sorted-set
;Returns a sorted set of elements.
(defn example []
  (println (sorted-set 3 2 1)))
(example)

;2	get
;Returns the element at the index position.
(defn example []
  (println (get (set '(3 2 1)) 2))
  (println (get (set '(3 2 1)) 1)))
(example)

;3	contains?
;Finds out whether the set contains a certain element or not.
(defn example []
  (println (contains? (set '(3 2 1)) 2))
  (println (contains? (set '(3 2 1)) 5)))
(example)

;4	conj
;Appends an element to the set and returns the new set of elements.
(defn example []
  (println (conj (set '(3 2 1)) 5)))
(example)

;5	disj
;Disjoins an element from the set.
(defn example []
  (println (disj (set '(3 2 1)) 2)))
(example)

;6	union
;Return a set that is the union of the input sets
(defn example []
  (println (set/union #{1 2} #{3 4})))
(example)

;7	difference
;Return a set that is the first set without elements of the remaining sets.
(defn example []
  (println (set/difference #{1 2 5} #{2 3 4})))
(example)

;8	intersection
;Return a set that is the intersection of the input sets.
(defn example []
  (println (set/intersection #{1 2} #{2 3})))
(example)

;9	subset?
;Is set1 a subset of set2?
(defn example []
  (println (set/subset? #{1 2} #{2 3}))
  (println (set/subset? #{1 2} #{1 2 3})))
(example)

;10	superset?
;Is set1 a superset of set2?
(defn example []
  (println (set/superset? #{1 2} #{1 2 3}))
  (println (set/superset? #{1 2 3} #{1 2})))
(example)
