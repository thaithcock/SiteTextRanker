package com.tyler.service;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Uses Jsoup
 *
 * has issues getting text correctly for things like footer links, etc.
 */
public class JSoupSiteTextGetter implements SiteTextGetter {

    /**
     * @param url to site
     * @return text of site
     */
    public String getText(String url) throws IOException {
        return Jsoup.connect(url).get().text();
    }
}
