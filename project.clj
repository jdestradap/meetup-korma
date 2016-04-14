(defproject meetup-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [korma "0.4.2"]
                 [org.postgresql/postgresql "9.4-1206-jdbc4"]
                 [migratus "0.8.13"]
                 [org.slf4j/slf4j-log4j12 "1.7.9"]
                 [environ "1.0.2"]]

  :main ^:skip-aot meetup-clojure.core
  :target-path "target/%s"
  :migratus {:store :database}
  :plugins [[migratus-lein "0.2.1"]]
  :profiles 
  {:uberjar {:aot :all}
   :dev [:project/dev :profiles/dev]
   :project/dev {:repl-options {:init-ns user}
                 :env {:dev  true
                       :port 3000
                       :nrepl-port 7000}}
   :profiles/dev {}
   })
