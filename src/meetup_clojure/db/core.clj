(ns meetup-clojure.db.core
  (:require
   [korma.db :refer :all]
   [korma.core :refer :all]
   [clojure.string :as str])
  )

(defdb korma-db (postgres {:db "korma-db"
                           :user "korma"
                           :password "kormapass"
                           }))
(println "sss")

(defentity users)
(select users)
