# Amy Six

Clojure library for working with User-Agent strings.

## Overview

User-Agent strings are complicated, stupid, and broken, and you should always
use client-side feature detection instead of trying to determine what browser
the client is using. [1](#reference_1) [2](#reference_2) [3](#reference_3)

That said, sometimes you gotta do what you gotta do. **Amy Six** is here to help.

**Amy Six** does not correctly parse the User-Agent string; I don't know if
that's even possible to do, given all the variants/workarounds/garbage they
contain. What it does is a heuristic match of "things that tend to show up in
the User-Agent for a specific browser", deriving from that whatever information
it can about the browser in the form of assertions.

All of these matches are driven by a table of matchers (string literals and
regular expressions) to corresponding assertions. This table is continually
being updated with new User-Agent strings, and so should become increasingly
accurate over time. There is also a table-driven set of unit tests, to ensure
changes to assertion weights or the heuristic itself don't break previously
verified User-Agent strings.

## Usage

	=> (require '[amy-six.user-agent :as ua])
	nil
	=> (def user-agent "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET CLR 1.0.3705; .NET CLR 1.1.4322)")
	#'user/user-agent
	=> (ua/family user-agent)
	"Internet Explorer"
	=> (ua/version user-agent)
	"8.0"

If you want to avoid parsing the User-Agent string repeatedly, use `ua/parse`
first, and then call `ua/family` etc. on the resulting map.

	=> (def browser (ua/parse user-agent))
	#'user/browser
	=> (ua/family browser)
	"Internet Explorer"
	
## Resources

Many of the test cases (and matchers) were derived from [UserAgentString.com](http://www.useragentstring.com/).

## References

<a name="reference_1">[History of the browser user-agent string](http://webaim.org/blog/user-agent-string-history/)</a>  
<a name="reference_2">[Understanding user-agent strings](https://msdn.microsoft.com/en-us/library/ms537503(v=vs.85).aspx)</a>  
<a name="reference_3">[Stack Overflow](http://stackoverflow.com/search?q=user+agent+string)</a>  
