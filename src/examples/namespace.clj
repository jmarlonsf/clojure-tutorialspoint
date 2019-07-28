; https://www.tutorialspoint.com/clojure/clojure_namespaces.htm
(ns examples.namespace
  (:require [clojure.set :as set])
  (:gen-class))

;1	*ns*
;This is used to look at your current namespace.
(defn example []
  (println *ns*))
(example)
;2	ns
;This is used to create a new namespace and associate it with the running program.
(defn hello-world []
  (println *ns*))
(hello-world)

;3	alias
;Add an alias in the current namespace to another namespace. Arguments are two symbols: the alias to be used and the symbolic name of the target namespace.
; FIXME: Caused by: java.lang.Exception: No namespace: examples.hello found
; (defn example []
;  (alias 'string 'examples.hello))
;(example)

;4	all-ns
;Returns a list of all namespaces.
(defn example []
  (println (all-ns)))
(example)

;5	find-ns
;Finds and returns a particular namespace.
(defn example []
  (println (find-ns 'clojure.string)))
(example)

;6	ns-name
;Returns the name of a particular namespace.
(defn example []
  (println (ns-name 'clojure.string)))
(example)

;7	ns-aliases
;Returns the aliases, which are associated with any namespaces.
(defn example []
  (println (ns-aliases 'clojure.core)))
(example)

;8	ns-map
;Returns a map of all the mappings for the namespace.
(defn example []
  (println (count (ns-map 'clojure.core))))
(example)

;9	un-alias
;Returns a map containing only those entries in map whose key is in keys.
(defn example []
  (alias 'string 'clojure.core)
  (ns-unalias 'clojure.core 'string))
(example)