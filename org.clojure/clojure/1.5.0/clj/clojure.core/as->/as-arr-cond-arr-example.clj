;;; Used with `cond->`, allows a series of optional transforms to
;;; try to get desired result out of a series of possibilities.
(defn get-the-state-atom
  "Given a component, or a reconciler, or the state atom, return the state atom.

        (swap! (get-the-state-atom reconciler) assoc :logging-enabled true)    
"
  [x]
  (as-> x thing
    ;; If `thing` is a component, get its reconciler
    (cond-> thing (om/component? thing) (om/get-reconciler))
    ;; If 'thing` is (or is now) a reconciler, pull the state atom out of it
    (cond-> thing (om/reconciler? thing) (get-in [:config :state] {}))))

(defn get-the-state
  "Given a component, or a reconciler, a state atom, or the state, return the state.

        (when (:logging-enabled (get-the-state reconciler))
          (.log js/conaole \"we made it this far\"))
"
  [x]
  (as-> x thing
    ;; Get the state atom from thing (assuming its there)
    (get-the-state-atom thing)
    ;; If what we have is an atom, deref it
    (cond-> thing (instance? Atom thing) (deref))))
