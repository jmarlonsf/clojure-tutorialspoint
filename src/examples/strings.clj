; https://www.tutorialspoint.com/clojure/clojure_strings.htm
(ns examples.strings
  (:gen-class))

(defn hello-world []
   (println "Hello World")
   (println "This is a demo application"))
(hello-world)

; String operations
;1	str
;The concatenation of strings can be done by the simple str function.
(defn hello-world []
  (println (str "Hello" "World"))
  (println (str "Hello" "World" "Again")))
(hello-world)

;2	format
;The formatting of strings can be done by the simple format function. The format function formats a string using java.lang.String.format.
(defn hello-world []
  (println (format "Hello , %s" "World"))
  (println (format "Pad with leading zeros %06d" 1234)))
(hello-world)

;3	count
;Returns the number of characters in the string.
(defn hello-world []
  (println (count "Hello")))
(hello-world)

;4	subs
;Returns the substring of ‘s’ beginning at start inclusive, and ending at end (defaults to length of string), exclusive.
(defn hello-world []
  (println (subs "HelloWorld" 2 5))
  (println (subs "HelloWorld" 5 7)))
(hello-world)

;5	compare
;Returns a negative number, zero, or a positive number when ‘x’ is logically 'less than', 'equal to', or 'greater than' ‘y’.
(defn hello-world []
  (println (compare "Hello" "hello"))
  (println (compare "Hello" "Hello")))
(hello-world)

;6	lower-case
;Converts string to all lower-case.
(defn hello-world []
  (println (clojure.string/lower-case "HelloWorld"))
  (println (clojure.string/lower-case "HELLOWORLD")))
(hello-world)

;7	upper-case
;Converts string to all upper-case.
(defn hello-world []
  (println (clojure.string/upper-case "HelloWorld"))
  (println (clojure.string/upper-case "helloworld")))
(hello-world)
;8	join
;Returns a string of all elements in collection, as returned by (seq collection), separated by an optional separator.
(defn hello-world []
  (println (clojure.string/join ", " [1 2 3])))
(hello-world)

;9	split
;Splits string on a regular expression.
(defn hello-world []
  (println (clojure.string/split "Hello World \\o/" #" ")))
(hello-world)

;10	split-lines
;Split strings is based on the escape characters \n or \r\n.
(defn hello-world []
  (println (clojure.string/split-lines "Hello\nWorld")))
(hello-world)

;11	reverse
;Reverses the characters in a string.
(defn hello-world []
  (println (reverse "Hello World")))
(hello-world)
;12	replace
;Replaces all instance of a match in a string with the replacement string.
(defn hello-world []
  (println (clojure.string/replace "The tutorial is about Groovy" #"Groovy"
                                   "Clojure")))
(hello-world)

;13	trim
;Removes whitespace from both ends of the string.
(defn hello-world []
  (println (clojure.string/trim " White spaces ")))
(hello-world)
;14	triml
;Removes whitespace from the left hand side of the string.
(defn hello-world []
  (println (clojure.string/triml " White spaces ")))
(hello-world)

;15	trimr
;Removes whitespace from the right hand side of the string.
(defn hello-world []
  (println (clojure.string/trimr " White spaces ")))
(hello-world)