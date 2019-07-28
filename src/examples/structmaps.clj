;https://www.tutorialspoint.com/clojure/clojure_structmaps.htm
(ns examples.structmaps
  (:gen-class))


;1	defstruct
;(defstruct structname keys)
;This function is used for defining the structure which is required.
(defn Example []
  (println (defstruct Employee :EmployeeName :Employeeid)))
(Example)

;2	struct
;(struct structname values)
;This function is used to define a structure object of the type, which is created by the defstruct operation.
(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct Employee "John" 1))
  (println emp))
(Example)

;3	struct-map
;(struct-map structname keyn valuen …. )
;This function is used to specifically assign values to key values by explicitly defining which values get assigned to which keys in the structure.
(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println emp))
(Example)

;4	Accessing Individual Fields
; :key structure-name
;Individual fields of the structure can be accessed by accessing the keys along with the structure object.
(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println (:Employeeid emp))
  (println (:EmployeeName emp)))
(Example)

;5	Immutable Nature
;By default structures are also immutable, so if we try to change the value of a particular key, it will not change.
(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println (:EmployeeName emp))

  (assoc emp :EmployeeName "Mark")
  (println (:EmployeeName emp)))
(Example)

(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (def newemp (assoc emp :EmployeeName "Mark"))
  (println newemp))
(Example)

;6	Adding a New Key to the Structure
;Since structures are immutable, the only way that another key can be added to the structure is via the creation of a new structure.
; An example on how this can be achieved is shown in the following program.
(defn Example []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (def newemp (assoc emp :EmployeeRank "A"))
  (println newemp))
(Example)
