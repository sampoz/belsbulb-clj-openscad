(ns belsebulb-clj-openscad.core
  (:refer-clojure :exclude [use import])
  (:require [scad-clj.scad :refer :all]
            [scad-clj.model :refer :all]
            [unicode-math.core :refer :all])
  (:gen-class))

; In mm
(def power-supply-length 149)
(def power-supply-width 99)
(def power-supply-height 50)

(def leg-radius 10)
(def leg-height 200)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! Be lighted! Fiat Lux")

  (def power-sypply-mock
    (cube  power-supply-width power-supply-length power-supply-height))

  (def leg
    (cylinder leg-radius leg-height ))

  (defn legs [x]
    (union (dotimes [n 5]
               println "here be legs")))

  (def primitives
    (union
     power-sypply-mock
     leg))
  (spit "belsebulb-clj.scad"
        (write-scad primitives))
  )
