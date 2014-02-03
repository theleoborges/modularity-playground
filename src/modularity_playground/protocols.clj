(ns modularity-playground.protocols)

(defprotocol Repository
  (insert! [this attrs])
  (select  [this filters])
  (delete! [this filters]))
