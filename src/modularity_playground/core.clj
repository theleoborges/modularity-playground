(ns modularity-playground.core
  (:require [modularity-playground.domain :as domain]
            [modularity-playground.db :as db]))



(def conn ;; create db conn pool from some db spec
  )


(def app-config
  {:book-repo (db/make-repository conn :books)})

(defn init
  "Sample app interaction"
  []
  ((domain/create-book! {:title "something cool"}) app-config)
  ((domain/find-book-by-id 10) app-config))
