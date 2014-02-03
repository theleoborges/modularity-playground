(ns modularity-playground.core
  (:require [modularity-playground.domain :as domain]
            [modularity-playground.db :as db]))



(def conn ;; create db conn pool from some db spec
  )

(def book-repository (db/make-repository conn :books))


(defn init
  "Sample app interaction"
  []
  (domain/create-book!     book-repository {:title "something cool"})
  (domain/find-book-by-id  book-repository 10))
