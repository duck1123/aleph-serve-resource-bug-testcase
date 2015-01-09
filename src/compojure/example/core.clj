(ns compojure.example.core
  (:require [aleph.http :refer [start-http-server]]
            [clojure.string :as string]
            compojure.example.routes)
  )

(def ^:dynamic *future-web* (ref nil))

(defn start
  "Start a http server"
  [port]
  (let [handler compojure.example.routes/app]
    ;; start server
    (let [stop-function (start-http-server handler
                                           {:port port
                                            :websocket true
                                            :join? false})]
      (dosync
       (ref-set *future-web* stop-function))
      (println "started"))))

(defn stop
  "Stop http server"
  []
  (@*future-web*))

(defn -main
  [& options]
  (start 3000))
