(ns amy-six.user-agent
  "Helper functions for extracting information from User-Agent strings.")

;; Special thanks to http://useragentstring.com/ for listings of common
;; user agent strings and their breakdowns.

(defprotocol UserAgent)

(defn components
  "Breaks the user agent string into a list of component strings."
  [user-agent]
  nil)
