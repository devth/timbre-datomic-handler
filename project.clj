(defproject devth/timbre-datomic-handler "0.1.1-SNAPSHOT"
  :description "A simple Datomic handler that logs via Timbre"
  :url "https://github.com/devth/timbre-datomic-handler"
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.10.0"]])
