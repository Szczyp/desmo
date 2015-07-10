(defproject desmo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [prismatic/plumbing "0.4.4"]
                 [ossicone "0.1.0-SNAPSHOT"]
                 [jamesmacaulay/zelkova "0.4.0"]]
  :plugins [[lein-cljsbuild "1.0.6"]]
  :cljsbuild
  {:builds {:dev {:source-paths ["src" "dev"]
                  :compiler {:output-to  "resources/public/js/app.js"
                             :output-dir "resources/public/js/out"
                             :main cljs.user
                             :asset-path "js/out"
                             :optimizations :none
                             :source-map true
                             :pretty-print  true}}}}
  :profiles {:dev {:dependencies [[weasel "0.7.0"]
                                  [com.cemerick/piggieback "0.2.1"]
                                  [org.clojure/tools.nrepl "0.2.10"]
                                  [ring/ring-core "1.4.0-RC2"]
                                  [ring/ring-jetty-adapter "1.4.0-RC2"]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
                   :source-paths ["dev"]}})
