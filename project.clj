(defproject belsebulb-clj-openscad "0.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GPL v3"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [scad-clj "0.5.2"]
                 [unicode-math "0.2.0"]]
  :main ^:skip-aot belsebulb-clj-openscad.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
