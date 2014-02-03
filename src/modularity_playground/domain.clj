(ns modularity-playground.domain)

(defn create-book! [create-fn book]
  ;; does some validation etc..
  (create-fn book))

(defn find-book-by-id [select-fn id]
  (select-fn {:id id}))

(defn delete-book [delete-fn id]
  (delete-fn id))
