(ns modularity-playground.domain
  (require [modularity-playground.protocols :as protocols]))

(defn create-book! [repo book]
  ;; does some validation etc..
  (protocols/insert! repo book))

(defn find-book-by-id [repo id]
  ;; does some validation etc..
  (protocols/select repo {:id id}))

(defn delete-book [repo id]
  ;; does some validation etc..
  (protocols/delete! repo {:id id}))
