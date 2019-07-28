; https://www.tutorialspoint.com/clojure/clojure_atoms.htm
(ns examples.atoms
  (:gen-class))

(defn example []
  (def myatom (atom 1))
  (println @myatom))
(example)

;1	reset!
;Sets the value of atom to a new value without regard for the current value.
(defn example []
  (def myatom (atom 1))
  (println @myatom)

  (reset! myatom 2)
  (println @myatom))
(example)

;2	compare-and-set!
;Atomically sets the value of atom to the new value if and only if the current value of the atom is identical to the old value held by the atom.
;Returns true if set happens, else it returns false.
(defn example []
  (def myatom (atom 1))
  (println @myatom)

  (compare-and-set! myatom 0 3)
  (println @myatom)

  (compare-and-set! myatom 1 3)
  (println @myatom))
(example)

;3	swap!
;Atomically swaps the value of the atom with a new one based on a particular function.
(defn example []
  (def myatom (atom 1))
  (println @myatom)

  (swap! myatom inc)
  (println @myatom))
(example)