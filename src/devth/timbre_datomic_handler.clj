(ns devth.timbre-datomic-handler
  (:require [taoensso.timbre :as timbre]))

(defn handler
  "Datomic handler.
   See http://docs.datomic.com/monitoring.html#clojure-callbacks"
  [datomic-event]
  (timbre/info (pr-str datomic-event)))

(timbre/info "timbre-datomic-handler is loaded")
