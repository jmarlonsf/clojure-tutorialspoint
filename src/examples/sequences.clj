; https://www.tutorialspoint.com/clojure/clojure_sequences.htm
(ns examples.sequences
  (:gen-class))

(defn Example []
  (println (seq [1 2 3])))
(Example)

;1	cons
;Returns a new sequence where ‘x’ is the first element and ‘seq’ is the rest.
(defn Example []
  (println (cons 6 (seq [1 2 3]))))
(Example)

;2	conj
;Returns a new sequence where ‘x’ is the element that is added to the end of the sequence.
(defn Example []
  (println (conj [1 2 3] 0)))
(Example)

;3	concat
;This is used to concat two sequences together.
(defn Example []
  (def seq1 (seq [1 2]))
  (def seq2 (seq [3 4]))
  (def seq3 (seq [5 6]))
  (println (concat seq1 seq2 seq3)))
(Example)

;4	distinct
;Used to only ensure that distinct elements are added to the sequence.
(defn Example []
  (def seq1 (distinct (seq [1 1 2 2])))
  (println seq1))
(Example)

;5	reverse
;Reverses the elements in the sequence.
(defn Example []
  (def seq1 (reverse (seq [1 2 3])))
  (println seq1))
(Example)

;6	first
;Returns the first element of the sequence.
(defn Example []
  (def seq1 (seq [1 2 3]))
  (println (first seq1)))
(Example)

;7	last
;Returns the last element of the sequence.
(defn Example []
  (def seq1 (seq [1 2 3]))
  (println (last seq1)))
(Example)

;8	rest
;Returns the entire sequence except for the first element.
(defn Example []
  (def seq1 (seq [1 2 3 4 5]))
  (println (rest seq1)))
(Example)

;9	sort
;Returns a sorted sequence of elements.
(defn Example []
  (def seq1 (seq [5 4 3 2 1]))
  (def seq2 (sort seq1))
  (println seq2))
(Example)

;10	drop
;Drops elements from a sequence based on the number of elements, which needs to be removed.
(defn Example []
  (def seq1 (seq [5 4 3 2 1]))
  (def seq2 (drop 2 seq1))
  (println seq2))
(Example)

;11	take-last
;Takes the last list of elements from the sequence.
(defn Example []
  (def seq1 (seq [5 4 3 2 1]))
  (def seq2 (take-last 2 seq1))
  (println seq2))
(Example)
;12	take
;Takes the first list of elements from the sequence.
(defn Example []
  (def seq1 (seq [5 4 3 2 1]))
  (def seq2 (take 2 seq1))
  (println seq2))
(Example)

;13	split-at
;Splits the sequence of items into two parts. A location is specified at which the split should happen.
(defn Example []
  (def seq1 (seq [5 4 3 2 1]))
  (println (split-at 2 seq1)))
(Example)