; https://www.tutorialspoint.com/clojure/clojure_lists.htm
(ns examples.lists
  (:gen-class))

(defn example []
  (println (list 1 2 3 4)))
(example)

(defn example []
  (println (list 'a 'b 'c 'd)))
(example)

;1	list*
;Creates a new list containing the items prepended to the rest, the last of which will be treated as a sequence.
(defn example []
  (println (list* 4 [2,3])))
(example)
;2	first
;This function returns the first item in the list.
(defn example []
  (println (first (list 1 2 3))))
(example)
;3	nth
;This function returns the item in the ‘nth’(index) position in the list.
(defn example []
  (println (nth (list 1 2 3) 0))
  (println (nth (list 1 2 3) 2)))
(example)

;4	cons
;Returns a new list wherein an element is added to the beginning of the list.
(defn example []
  (println (cons 8 (list 1 2,3))))
(example)

;5	conj
;Returns a new list wherein the list is at the beginning and the elements to be appended are placed at the end.
(defn example []
  (println (conj (list 1 2,3) 4 5)))
(example)

;6	rest
;Returns the remaining items in the list after the first item.
(defn example []
  (println (rest (list 1 2,3))))
(example)