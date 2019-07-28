(ns examples.exception-handle
  (:gen-class))

(defn Example []
  (try
    (def string1 (slurp "Example.txt"))
    (println string1)
    (catch java.io.FileNotFoundException e (println (str "caught exception1: " (.toString e))))
    (finally (println "This is our finalally execution"))))
(Example)

(defn Example []
  (try
    (def string1 (slurp "Example.txt"))
    (println string1)
    (catch Exception e (println (str "caught exception2: " (.getMessage e))))))
(Example)

(defn Example []
  (try
    (def string1 (slurp "Example.txt"))
    (println string1)

    (catch java.io.FileNotFoundException e
      (println (str "caught file exception3: " (.getMessage e))))

    (catch Exception e (println (str "caught exception: " (.getMessage e)))))
  (println "Let's move on"))
(Example)

(defn Example []
  (try
    (aget (int-array [1 2 3]) 5)
    (catch Exception e (println (str "caught exception: " (.toString e))))
    (finally (println "This is our final block")))
  (println "Let's move on"))
(Example)

;Since Clojure derives its exception handling from Java, similar to Java, the following methods are available in Clojure for managing the exceptions.
;
;public String getMessage() − Returns a detailed message about the exception that has occurred. This message is initialized in the Throwable constructor.
;
;public Throwable getCause() − Returns the cause of the exception as represented by a Throwable object.
;
;public String toString() − Returns the name of the class concatenated with the result of getMessage().
;
;public void printStackTrace() − Prints the result of toString() along with the stack trace to System.err, the error output stream.
;
;public StackTraceElement [] getStackTrace() − Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
;
;public Throwable fillInStackTrace() − Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.