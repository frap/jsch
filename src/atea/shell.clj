(ns atea.shell
  (:require [ring.adapter.jetty]))

(comment
 (ns-publics (find-ns 'ring.adapter.jetty))
  ,)
(comment
  (require '[clojure.tools.deps.alpha.repl :refer [add-libs]])
  (add-libs '{ring/ring {:mvn/version "RELEASE"}})

  ,)
