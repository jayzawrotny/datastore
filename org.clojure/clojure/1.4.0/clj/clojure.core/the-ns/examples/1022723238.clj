;; Let's play with a namespace by its name and by its symbol 
(def for-later-use (create-ns 'my-namespace))
;; => #'user/for-later-use

(the-ns for-later-use)
;; => #<Namespace my-namespace>

(the-ns 'my-namespace)
;; => #<Namespace my-namespace>

;; not going to find anything this way because we just asked the repl
;; not to perform an evaluate on it and there is not such 
;; namespace with the name "for-later-use"
(the-ns 'for-later-use)
;; => java.lang.Exception: No namespace: for-later-use found (NO_SOURCE_FILE:0)

;; not going to work either because "my-namespace" is the name of a namespace
;; and not a symbol that points to something
(the-ns my-namespace)
;; => java.lang.Exception: Unable to resolve symbol: my-namespace in this context (NO_SOURCE_FILE:12)
