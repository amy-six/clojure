(ns amy-six.matchers
  "Library of User-Agent components/chunks to what they tell us about the
  browser.")

(defn matches
  "Returns a sequence of match successes and any associated data against the
  input string.

  Note that multiple matchers may succeed and result in conflicting assertions
  about the browser (e.g. [{:family \"Internet Explorer\"} {:family \"Firefox\"}]).
  This is because user agent strings are messy and inconsistent. Consumers of
  `match-string` should use some heuristic to pick which entry they believe, or
  simply return all matches."
  [user-agent matchers]
  (remove nil? (for [[matcher & {:as assertions}] matchers]
                 (when-let [result (re-find matcher user-agent)]
                   assertions))))

(def matchers
  "Each matcher combines a regex that will be tested against the User-Agent
  string, with a set of assertions that are *usually* true about browsers with
  that element in their User-Agent string.

  TODO:
  * Support strings or regexes as matchers.
  * Use capturing groups in regexes; let assertions make use of the captured
  strings."
  [[#"MSIE \d\.\d" :family "Internet Explorer"]
   [#"Trident/\d\.\d" :family "Internet Explorer"]])
