(defproject reagent-node-render-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :min-lein-version "2.5.3"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [reagent "0.6.1" :exclusions [cljsjs/react]]]

  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.9"]]

  :source-paths ["src"]

  :clean-targets ["renderer.js"
                  "target"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {
                :main reagent-node-render-demo.core
                :output-to "target/renderer_dev/reagent_node_render_demo.js"
                :output-dir "target/renderer_dev"
                :target :nodejs
                :optimizations :none
                :source-map true}}
             {:id "prod"
              :source-paths ["src"]
              :compiler {
                :output-to "renderer.js"
                :output-dir "target/renderer_prod"
                :preamble ["include.js"]
                :target :nodejs
                :optimizations :simple}}]})
