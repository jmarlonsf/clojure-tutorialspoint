; https://www.tutorialspoint.com/clojure/clojure_file_io.htm
(ns examples.file-io
  (:gen-class))

; Reading the Contents of a File as an Entire String
(defn Example1 []
  (def string1 (slurp "files/Example.txt"))
  (println string1))
(Example1)

; Reading the Contents of a File One Line at a Time
(defn Example2 []
  (with-open [rdr (clojure.java.io/reader "files/Example.txt")]
    (reduce conj [] (line-seq rdr))))
(Example2)

; Writing ‘to’ Files
(defn Example3 []
  (spit "files/Example.txt"
        "This is a string\n"))
(Example3)

; Writing ‘to’ Files One Line at a Time
(defn Example4 []
  (with-open [w (clojure.java.io/writer "files/Example.txt" :append true)]
    (.write w (str "hello" "world"))))
(Example4)

; Checking to See If a File Exists
(defn Example5 []
  (println (.exists (clojure.java.io/file "files/Example.txt"))))
(Example5)

; Reading from the Console
;user->(read-line)
;Hello World