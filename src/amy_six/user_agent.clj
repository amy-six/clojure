(ns amy-six.user-agent
  "Helper functions for extracting information from User-Agent strings.")

;; Special thanks to http://useragentstring.com/ for listings of common
;; user agent strings and their breakdowns.

(defprotocol UserAgent
  (family [this] "The browser family; e.g. \"Internet Explorer\", \"Chrome\"..."))

(defn parse
  [user-agent]
  {})

;(extend String
;  UserAgent
;  (family [this] (family (parse this))))

;(extend ILookup
;  UserAgent
;  (family [this] (:family this)))
