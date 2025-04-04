;; Module settings declaration
;;
;; ns [namespace]
;;    :gen-class - keyword for export
;;    :name - export naming
;;    :import (ns)(ns)(ns)
(ns mathclj.core
  (:gen-class :name mathclj.core)
  (:import (java.awt.event ActionListener)
           (javax.swing JFrame)
           (javax.swing JButton)))
;; create-gui
;;
;; Drawing Swing window from Clojure
;; environment.
;; Creates a window with button that prints
;; message in standard-output when it clicked
;; "Button clicked!"
(defn create-gui
  "Creates a window with a button that prints a message when clicked."
  []
  (let [frame (JFrame. "Clojure Window")
        button (JButton. "Click to say hello")]
    (.addActionListener button
                        (reify ActionListener
                          (actionPerformed [_ _]
                            (println "Button clicked!"))))
    (.add frame button)
    (.setSize frame 300 200)
    (.setVisible frame true)))

(create-gui)