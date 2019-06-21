# SiteTextRanker

Receives a URL and outputs the top 25 most common words in the page. Takes the to hit as the one and only parameter.

## Assumptions made:

1. URL passed to the class is fully formed and valid for JSoup to use.
1. Outputting the list to the terminal is fine
1. The SiteTextGetter implementation works correctly
   1. Jsoup does not correctly get all text in all instances. That is noted in its class.
1. Counting words is not case sensitive
1. Numbers (e.g., 123) are not words, but single letter "words" like 'v' or 'x' are

## How to run

Run as you would a normal jar.

`java -jar SiteTextRanker.jar https://www.your-cool-site.com`