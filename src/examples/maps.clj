;https://www.tutorialspoint.com/clojure/clojure_maps.htm
(ns examples.maps
  (:require [clojure.set :as set])
  (:gen-class))

; HashMaps
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println demokeys))
(example)

;SortedMaps
(defn example []
  (def demokeys (sorted-map "z" "1" "b" "2" "a" "3"))
  (println demokeys))
(example)

;1	get
;Returns the value mapped to key, not-found or nil if key is not present.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println demokeys)
  (println (get demokeys "b"))
  (println (get demokeys "x")))

(example)

;2	contains?
;See whether the map contains a required key.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (contains? demokeys "b"))
  (println (contains? demokeys "x")))
(example)

;3	find
;Returns the map entry for the key.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println demokeys)
  (println (find demokeys "b"))
  (println (find demokeys "x")))
(example)

;4	keys
;Returns the list of keys in the map.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (keys demokeys)))
(example)

;5	vals
;Returns the list of values in the map.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (vals demokeys)))
(example)

;6	dissoc
;Dissociates a key value entry from the map.
(defn example []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (dissoc demokeys "b")))
(example)

;7	merge
;Merges two maps entries into one single map entry.
(defn example []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demokeys1 (hash-map "a" 2 "h" 5 "i" 7))
  (println (merge-with + demokeys demokeys1)))
(example)

;8	merge-with
;Returns a map that consists of the rest of the maps conj-ed onto the first.
(defn example []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demokeys1 (hash-map "a" 2 "h" 5 "i" 7))
  (println (merge-with + demokeys demokeys1)))
(example)

;9	select-keys
;Returns a map containing only those entries in map whose key is in keys.
(defn example []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (println (select-keys demokeys ["z" "a"])))
(example)

;10	rename-keys
;Renames keys in the current HashMap to the newly defined ones.
(defn example []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demonew (set/rename-keys demokeys {"z" "newz" "b" "newb" "a" "newa"}))
  (println demonew))
(example)

;11	map-invert
;Inverts the maps so that the values become the keys and vice versa.
(defn example []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demonew (set/map-invert demokeys))
  (println demonew))
(example)