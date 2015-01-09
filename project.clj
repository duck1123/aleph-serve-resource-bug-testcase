(defproject compojure-example "0.1.0"
  :description "Example Compojure project"
  :dependencies [

                 [aleph "0.3.3"
                  :exclusions [
                               ;; org.clojure/tools.logging
                               org.clojure/tools.macro

                               ]
                  ]
                 [compojure "1.1.6"]
                 [org.clojure/clojure "1.6.0"]
                 ;; [hiccup "1.0.5"]
                 [org.webjars/jquery "2.1.3"]





                 ;; [ring "1.3.2"
                 ;;  :exclusions [ring/ring-core]
                 ;;  ]
                 ;; [ring/ring-core "1.2.2"]


                 ;; [clout "1.1.0"]
                 ;; [clj-time "0.4.4"]
                 ;; [commons-fileupload "1.3.1"]
                 ;; [org.clojure/tools.reader "0.8.13"]
                 ;; [ring/ring-codec "1.0.0"]
                 [ring/ring-core "1.1.8"]
                 ]
  :main compojure.example.core
  )
