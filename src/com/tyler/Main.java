package com.tyler;

import com.tyler.service.JSoupSiteTextGetter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.TextNode;

import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Assumptions made:
 *
 * 1. URL passed to the class is fully formed and valid for JSoup to use.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please pass a site url as the first and only parameter");
            System.exit(1);
        }

        // get the text from the URL
        String text;
        try {
            text = String.join(" ", Jsoup.connect(args[0]).get().text()
        } catch(IOException ioe) {
            System.out.println("Ran in to an IOException getting the text. Exiting with the exception");
            throw ioe;
        }

        System.out.print(text);

        /*
        // break up the text into word "tokens"
        String[] words = String

        // go through the words and count them up -- maybe do this and previous step simultaneously?
        // faster, less flexible, more potential for bugs


        // sort them


        // output


         */

        System.out.println("");
    }
}
