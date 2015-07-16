(ns amy-six.user-agent.test
  (:use amy-six.user-agent
        clojure.test))

(deftest test-components
  (are [user-agent expected] (= expected (components user-agent))
       "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36"
       ["Mozilla/5.0" "Macintosh" "Intel Mac OS X 10_10_4" "AppleWebKit/537.36" "KHTML, like Gecko" "Chrome/43.0.2357.134" "Safari/537.36"]
       "curl/7.19.6 (i386-redhat-linux-gnu) libcurl/7.19.6 NSS/3.12.4.5 zlib/1.2.3 libidn/1.9 libssh2/1.2"
       ["curl/7.19.6" "i386-redhat-linux-gnu" "libcurl/7.19.6" "NSS/3.12.4.5" "zlib/1.2.3" "libidn/1.9" "libssh2/1.2"]
       "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:24.0) Gecko/20100101 Thunderbird/24.4.0"
       ["Mozilla/5.0" "Windows NT 6.1" "WOW64" "rv:24.0" "Gecko/20100101" "Thunderbird/24.4.0"]
       "Mozilla/5.0 (PLAYSTATION 3; 1.90)"
       ["Mozilla/5.0" "PLAYSTATION 3" "1.90"]
       "Mozilla/5.0 (Windows NT; U; en) AppleWebKit/525.18.1 (KHTML, like Gecko) Version/3.1.1 Iris/1.1.7 Safari/525.20"
       ["Mozilla/5.0" "Windows NT" "U" "en" "AppleWebKit/525.18.1" "KHTML, like Gecko" "Version/3.1.1" "Iris/1.1.7" "Safari/525.20"]
       "Mozilla/5.0 (compatible; MSIE 9.0; Windows Phone OS 7.5; Trident/5.0; IEMobile/9.0)"
       ["Mozilla/5.0" "compatible" "MSIE 9.0" "Windows Phone OS 7.5" "Trident/5.0" "IEMobile/9.0"]
       "Mozilla/5.0 (BlackBerry; U; BlackBerry 9900; en) AppleWebKit/534.11+ (KHTML, like Gecko) Version/7.1.0.346 Mobile Safari/534.11+"
       ["Mozilla/5.0" "BlackBerry" "U" "BlackBerry 9900" "en" "AppleWebKit/534.11+" "KHTML, like Gecko" "Version/7.1.0.346" "Mobile" "Safari/534.11+"]
       "Mozilla/5.0 (Linux; U; Android 2.3.5; en-us; HTC Vision Build/GRI40) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"
       ["Mozilla/5.0" "Linux" "U" "Android 2.3.5" "en-us" "HTC Vision Build/GRI40" "AppleWebKit/533.1" "KHYML, like Gecko" "Version/4.0" "Mobile Safari/533.1"]
       "Mozilla/5.0 (Windows; U; Windows NT 6.2; WOW64; rv:1.8.0.7) Gecko/20110321 MultiZilla/4.33.2.6a SeaMonkey/8.6.55"
       ["Mozilla/5.0" "Windows" "U" "Windows NT 6.2" "WOW64" "rv:1.8.0.7" "Gecko/20110321" "MultiZilla/4.33.2.6a" "SeaMonkey/8.6.55"]
       "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/533.20.25 (KHTML, like Gecko) Version/5.0.4 Safari/533.20.27"
       ["Mozilla/5.0" "Windows" "U" "Windows NT 6.0" "en-US" "AppleWebKit/533.20.25" "KHTML, like Gecko" "Version/5.0.4" "Safari/533.20.27"]
       "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/533.20.25 (KHTML, like Gecko) Version/5.0.3 Safari/533.19.4"
       ["Mozilla/5.0" "Windows" "U" "Windows NT 6.0" "en-US" "AppleWebKit/533.20.25" "KHTML, like Gecko" "Version/5.0.3" "Safari/533.19.4"]
       "Mozilla/5.0 (Windows NT 6.0; rv:2.0) Gecko/20100101 Firefox/4.0 Opera 12.14"
       ["Mozilla/5.0" "Windows NT 6.0" "rv:2.0" "Gecko/20100101" "Firefox/4.0" "Opera 12.14"]
       "Mozilla/5.0 (Windows; U; Win 9x 4.90; SG; rv:1.9.2.4) Gecko/20101104 Netscape/9.1.0285"
       ["Mozilla/5.0" "Windows" "U" "Win 9x 4.90" "SG" "rv:1.9.2.4" "Gecko/20101104" "Netscape/9.1.0285"]
       "Links (6.9; Unix 6.9-astral sparc; 80x25)"
       ["Links" "6.9" "Unix 6.9-astral sparc" "80x25"]
       "Lynx/2.8.6rel.5 libwww-FM/2.14 SSL-MM/1.4.1 OpenSSL/1.0.0a"
       ["Lynx/2.8.6rel.5" "libwww-FM/2.14" "SSL-MM/1.4.1" "OpenSSL/1.0.0a"]
       "Mozilla/5.0 (X11; Linux 3.5.4-1-ARCH i686; es) KHTML/4.9.1 (like Gecko) Konqueror/4.9"
       ["Mozilla/5.0" "X11" "Linux 3.5.4-1-ARCH i686" "es" "KHTML/4.9.1" "like Gecko" "Konqueror/4.9"]
       "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; AS; rv:11.0) like Gecko"
       ["Mozilla/5.0" "Windows NT 6.1" "WOW64" "Trident/7.0" "AS" "rv:11.0" "like Gecko"]
       "Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; Trident/6.0)"
       ["Mozilla/5.0" "compatible" "MSIE 10.0" "Windows NT 6.1" "Trident/6.0"]
       "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1; Trident/5.0)"
       ["Mozilla/5.0" "compatible" "MSIE 9.0" "Windows NT 7.1" "Trident/5.0"]
       "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; InfoPath.2; SLCC1; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET CLR 2.0.50727)"
       ["Mozilla/5.0" "compatible" "MSIE 8.0" "Windows NT 5.1" "Trident/4.0" "InfoPath.2" "SLCC1" ".NET CLR 3.0.4506.2152" ".NET CLR 3.5.30729" ".NET CLR 2.0.50727"]
       "Mozilla/5.0 (compatible; MSIE 7.0; Windows NT 6.0; fr-FR)"
       ["Mozilla/5.0" "compatible" "MSIE 7.0" "Windows NT 6.0" "fr-FR"]
       "Mozilla/5.0 (Windows NT 6.3; rv:36.0) Gecko/20100101 Firefox/36.0"
       ["Mozilla/5.0" "Windows NT 6.3" "rv:36.0" "Gecko/20100101" "Firefox/36.0"]
       "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36"
       ["Mozilla/5.0" "Windows NT 6.1" "AppleWebKit/537.36" "KHTML, like Gecko" "Chrome/41.0.2228.0" "Safari/537.36"]))
