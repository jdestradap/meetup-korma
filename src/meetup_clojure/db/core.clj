(ns meetup-clojure.db.core
  (:require
   [korma.db :refer :all]
   [clojure.string :as str])
  )

(defdb korma-db (postgres {:db "korma"
                           :user "korma"
                           :password "kormapass"
                           }))
