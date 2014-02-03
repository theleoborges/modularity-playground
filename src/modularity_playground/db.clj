(ns modularity-playground.db
  ;; this would require things like clojure.java.jdbc or
  ;; korma / honeysql
  )


;; These functions would deal with the database as
;; well as the parsing of result-sets
;; (such as transforming underscore_names into keyword-names)

(defn insert! [conn table-name attrs]
  (prn "Insert " attrs " into " table-name))

(defn select [conn table-name filters]
  (prn "Select" filters " from " table-name))

(defn delete! [conn table-name filters]
  (prn "Select" filters " from " table-name))
