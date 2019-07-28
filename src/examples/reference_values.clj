;https://www.tutorialspoint.com/clojure/clojure_reference_values.htm
(ns examples.reference-values
  (:gen-class))

;1	ref
;(ref x options)
;This is used to create a reference value. When creating a reference value, there is an
; option to provide a validator function, which will validate the value created.
(defn Example []
  (def my-ref (ref 1 :validator pos?))
  (println @my-ref))
(Example)

;2	ref-set
;(ref-set refname newvalue)
;This function is used to set the value of a reference to a new value irrespective of whatever is the older value.
(defn Example []
  (def my-ref (ref 1 :validator pos?))
  (dosync
    (ref-set my-ref 2))
  (println @my-ref))
(Example)

;3	alter
;(alter refname fun)
;This function is used to alter the value of a reference type but in a safe manner.
; This is run in a thread, which cannot be accessed by another process.
(defn Example []
  (def names (ref []))

  (defn change [newname]
    (dosync
      (alter names conj newname)))
  (change "John")
  (change "Mark")
  (println @names))
(Example)

;4	dosync
;(dosync expression)
;Runs the expression (in an implicit do) in a transaction that encompasses expression and any nested calls.
(defn Example []
  (def names (ref []))

  (defn change [newname]
    (dosync
      (alter names conj newname)))
  (change "John")
  (change "Mark")
  (println @names))
(Example)

;5	commute
; (commute refname fun)
;Commute is also used to change the value of a reference type just like alter and ref-set.
(defn Example []
  (def counter (ref 0))

  (defn change [counter]
    (dosync
      (commute counter inc)))
  (change counter)
  (println @counter)

  (change counter)
  (println @counter))
(Example)