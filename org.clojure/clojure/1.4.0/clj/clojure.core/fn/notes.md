## Arities

    [name? bindings pre-post-map? & forms]
    [name? & arities]

## Docs

Macro used to define anonymous functions.
Roughly equivalent to `lambda` from rⁿrs, but can have multiple arities.
[Destructuring](http://clojure.org/reference/special_forms#binding-forms) is supported in argument bindings.

Accepts an optional symbol name, followed by either

- A series of lists `([binding*] pre-post? & form*)` each specifying an arity of the `fn`.
- A vector of bindings followed an optional pre-post map and body forms, in which case the `fn` is implicitly single arity.

[Type hints](http://clojure.org/reference/java_interop#typehints) may be applied to arity bindings.
A type hint on the binding vector itself is understood to be a hint on the return type of the arity.

pre-post maps are maps which may have the keys `:pre` and `:post`.
These are expected to be vectors of assertion expressions.
`:pre` expressions will be evaluated before the body of the arity, and have access to all arguments and destructurings of the function.
`:post` expressions will be evaluated after the body of the arity, and have access to the return value of the arity via the special local `%`.

Within the body forms, recursion is possible via clj::clojure.core/recur or by invoking the name of the `fn` if one was given.

## See also

- clj::clojure.core/defn which should be preferred to `(def x (fn ...))`.
- clj::clojure.core/fn?, a predicate for testing whether a value is a `fn`.
- clj::clojure.core/partial which should be preferred to `(fn [x] (f y x))`.
- clj::clojure.core/some-fn which should be preferred to `(fn [x] (or (g x) (h x) ...))`.
- clj::clojure.core/every-pred which should be preferred to `(fn [x] (and (g x) (h x) ...))`.
