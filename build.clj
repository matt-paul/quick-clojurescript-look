;; require the cljs.build.api namespace
(require 'cljs.build.api)


;; invoke the standard function for building some ClojureScript source, taking
;; two arguments....the directory to compile, and a map of options
(cljs.build.api/build "src" 
  {:main 'hello-world.core
   :output-to "out/main.js"})
