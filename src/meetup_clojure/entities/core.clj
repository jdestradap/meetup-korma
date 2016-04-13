(ns meetup-clojure.entities.core
  (:require
   [korma.core :refer :all]))

(declare users email address state account posts)

(defentity users)
