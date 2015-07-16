(ns amy-six.user-agent
  "Helper functions for extracting information from User-Agent strings."
  (:use [amy-six.matchers]))

;; Special thanks to http://useragentstring.com/ for listings of common
;; user agent strings and their breakdowns.

(defprotocol UserAgent
  (family [this] "The browser family; e.g. \"Internet Explorer\", \"Chrome\"..."))

(defn parse
  [user-agent]
  "Parse a User-Agent string into a map of things-we-know about the browser."
  ; TODO: Heuristic for dealing with multiple, potentially conflicting, entries
  ; for the same key.
  (apply merge (matches user-agent matchers)))

(extend-type String UserAgent
  (family [this] (family (parse this))))

(extend-type clojure.lang.ILookup UserAgent
  (family [this] (:family this)))
