(defproject gapi "1.0.0-SNAPSHOT"
  :description "A simple pure clojure interface for Google web services"
  :license {:name "The Apache Software License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :url "https://github.com/ianbarber/clj-gapi"
  :dependencies [[org.clojure/clojure "1.5.1"]
	[org.clojure/data.json "0.2.3"]
	[clj-http "0.7.6"]]
  :main gapi.core)
