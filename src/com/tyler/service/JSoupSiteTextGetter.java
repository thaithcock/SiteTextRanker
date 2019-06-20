package com.tyler.service;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Class to get text from a URL
 */
public class JSoupSiteTextGetter implements SiteTextGetter {

    /**
     * @param url to site
     * @return text of site
     */
    public String getText(String url) throws IOException {
        System.out.println("hitting url: " + url);
        return Jsoup.connect(url).get().text();
    }
}
