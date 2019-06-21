package com.tyler.service;

/**
 * This interface is provided to make it easier to swap between different "SiteTextGetters"
 * in case, for example, the implementation has a bug or becomes unmaintained or any
 * other variety of reasons
 */
public interface SiteTextGetter {
    String getText(String url) throws Exception;
}
