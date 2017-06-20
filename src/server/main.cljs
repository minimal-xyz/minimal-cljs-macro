
(ns server.main
  (:require [server.foo :refer (some-macro)]))

(defn main []
  (some-macro "Hello!"))
