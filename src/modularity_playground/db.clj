(ns modularity-playground.db
  ;; this would require things like clojure.java.jdbc or
  ;; korma / honeysql
  (require [modularity-playground.protocols :refer [Repository]])
  )


;; These functions would deal with the database as
;; well as the parsing of result-sets
;; (such as transforming underscore_names into keyword-names)

(defn- insert! [conn table-name attrs]
  (prn "Insert " attrs " into " table-name))

(defn- select [conn table-name filters]
  (prn "Select " filters " from " table-name))

(defn- delete! [conn table-name filters]
  (prn "Delete " filters " from " table-name))

(defn make-repository [conn table-name]
  (reify Repository
    (insert! [_ attrs]
      (insert! conn table-name attrs))

    (select  [_ filters]
      (select conn table-name filters))

    (delete! [_ filters]
      (delete! conn table-name filters))))
