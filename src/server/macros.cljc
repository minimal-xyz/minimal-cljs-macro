
(ns server.macros
  (:require [server.foo :refer [bar]]))

(defmacro some-macro [x]
  `(bar ~x))
