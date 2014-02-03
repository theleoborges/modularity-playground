(ns modularity-playground.core
  (:require [modularity-playground.domain :as domain]
            [modularity-playground.db :as db]))



(def conn ;; create db conn pool from some db spec
  )

(def create-book! (partial domain/create-book!
                           (partial db/insert! conn :books)))

(def select-book (partial domain/find-book-by-id
                          (partial db/select conn :books)))

(defn init
  "Sample app interaction"
  []
  (create-book! {:title "something cool"})
  (select-book 10))
