(clojure.pprint/pprint (Throwable->map (IllegalArgumentException. "Bad arguments")))
;; => nil

;; Printed output
(comment
  {:via
   [{:type java.lang.IllegalArgumentException,
     :message "Bad arguments",
     :at [user$eval3 invokeStatic "NO_SOURCE_FILE" 1]}],
   :trace
   [[user$eval3 invokeStatic "NO_SOURCE_FILE" 1]
    [user$eval3 invoke "NO_SOURCE_FILE" 1]
    [clojure.lang.Compiler eval "Compiler.java" 7176]
    [clojure.lang.Compiler eval "Compiler.java" 7131]
    [clojure.core$eval invokeStatic "core.clj" 3214]
    [clojure.core$eval invoke "core.clj" 3210]
    [clojure.main$repl$read_eval_print__9068$fn__9071
     invoke
     "main.clj"
     414]
    [clojure.main$repl$read_eval_print__9068 invoke "main.clj" 414]
    [clojure.main$repl$fn__9077 invoke "main.clj" 435]
    [clojure.main$repl invokeStatic "main.clj" 435]
    [clojure.main$repl_opt invokeStatic "main.clj" 499]
    [clojure.main$main invokeStatic "main.clj" 598]
    [clojure.main$main doInvoke "main.clj" 561]
    [clojure.lang.RestFn invoke "RestFn.java" 397]
    [clojure.lang.AFn applyToHelper "AFn.java" 152]
    [clojure.lang.RestFn applyTo "RestFn.java" 132]
    [clojure.lang.Var applyTo "Var.java" 705]
    [clojure.main main "main.java" 37]],
   :cause "Bad arguments"})
