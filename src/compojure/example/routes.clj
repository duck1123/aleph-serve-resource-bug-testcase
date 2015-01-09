(ns compojure.example.routes
  (:use compojure.core)
  (:require [aleph.http :as http]
            [compojure.route :as route]
            [compojure.response :as response]))

(defroutes main-routes
  ;; (GET "/" [] (index-page))
  (route/resources "/webjars/" {:root "META-INF/resources/webjars/"})
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (http/wrap-ring-handler main-routes))
