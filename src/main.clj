(ns main)
; Exercise 2.1
; Euclid algorithm detecting Global
; (shared) enumerator. Recursive functions intro
(defn euq-gdn [x y]
  ; if y == 0 -> x
  (if (= y 0) ( x )
              (euq-gdn y (rem x y))
              ))

; Exercise 1.1
; Absolute function for numbers using
; condition operator
(defn absolute [x]
  (cond (> x 0) x)
        (< x 0) (- x)
        (= x 0) 0)

; Exercise 1.1
; Absolute function for numbers using
; if operator
(defn absolute-2 [x]
  (if (> x 0)
    (+ x)
    (- x)))

; Exercise 1.2 Translate expression to Lisp
(defn expr-12 []
  (float (/
           (+ 5 4
              (- 2 (- 3 (- 6 (/ 4 5)))))
           (* 3
              (- 6 2) (- 2 7))))
  )

; Exercise 1.3
; Factorial computing function
(defn fact-l [x]
  (if (= x 1) 1
        (* x (fact-l (- x 1)))))

; Exercise 0.3
; Abstractions
; ======================================
(defn cube [x]
  (* x x x))

(defn square [x]
  (* x x))
;=======================================

; Exercise 0.2
; hi-for-everyone
; tells to standard output hello
; for everyone
(defn hello-for-everyone []
  (println "hi for everyone"))

; Exercise 0.1
; hi-for-who
; tells to standard output hello
; for current user [username]
(defn hello-for-who [username]
  (println (str "hi, " username)))

; Like in Java: applets have [EntryPoint]
; in "-main" function.
(defn -main []
  ; pipeline
  (println (.toUpperCase "hello"))
  ; combinations
  (println (str 1 2 3 nil 4))
  ; function invoke: arguments
  (hello-for-who "sonya")
  ; function invoke: no arguments
  (hello-for-everyone)
  ; syntax tells: (do-something [with everyThing])
  (println (first (System/getProperties)))
  ;test factorial function
  (println (fact-l 6))
  0)

