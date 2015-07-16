(ns amy-six.matchers.test
  (:use amy-six.matchers
        clojure.test))

;; Special thanks to http://useragentstring.com/ for listings of common
;; User-Agent strings and their breakdowns.

(defn match-contains?
  [k value user-agent]
  (some #{value}
        (map k (matches user-agent matchers))))

(deftest test-match-string-family
  (testing "Internet Explorer"
    (testing "IE 8"
      (is (match-contains? :family "Internet Explorer" "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; GTB7.4; InfoPath.2; SV1; .NET CLR 3.3.69573; WOW64; en-US)" ))
      (is (match-contains? :family "Internet Explorer" "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET CLR 1.0.3705; .NET CLR 1.1.4322)"))
      (is (match-contains? :family "Internet Explorer" "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; InfoPath.2; SLCC1; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET CLR 2.0.50727)"))
      (is (match-contains? :family "Internet Explorer" "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; Media Center PC 6.0; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C)")))
    (testing "IE 9")
    (testing "IE 10")
    (testing "IE 11")))
