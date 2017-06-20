
(ns server.main
  (:require-macros [server.macros :refer [some-macro]])
  (:require [server.foo]))

; server.foo is required... or compiler will warn

(defn main! []
  (some-macro "Hello!"))
