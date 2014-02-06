(ns modularity-playground.domain
  (require [modularity-playground.protocols :as protocols]
           [clojure.algo.monads :refer [domonad reader-m asks]]))

(defn create-book! [book]
  ;; does some validation etc..
  (domonad reader-m [repo (asks :book-repo)]

           (protocols/insert! repo book)))

(defn find-book-by-id [id]
  ;; does some validation etc..
    (domonad reader-m [repo (asks :book-repo)]
             (protocols/select repo {:id id})))

(defn delete-book [id]
  ;; does some validation etc..
    (domonad reader-m [repo (asks :book-repo)]
             (protocols/delete! repo {:id id})))
