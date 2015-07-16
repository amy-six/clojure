(ns amy-six.user-agent.test
  (:use amy-six.user-agent
        clojure.test))

(deftest test-family
  (is (= "Internet Explorer" (family "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; Media Center PC 6.0; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C)"))))
