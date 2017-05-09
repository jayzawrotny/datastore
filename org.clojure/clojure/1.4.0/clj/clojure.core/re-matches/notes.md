`(re-matches regex s)` is the same as `(re-find regex s)`, except that re-matches only returns a match result if the regex can be matched against the entire string.
`re-find` returns a match if the regex can be matched against any substring of the given string.

See also:

- clj::clojure.core/re-find
- clj::clojure.core/re-seq
- clj::clojure.core/re-pattern
- clj::clojure.core/re-matcher
- clj::clojure.core/re-groups
- clj::clojure.string/replace
- clj::clojure.string/replace-first


See docs for function `subs`, section 'Memory use warning'.
