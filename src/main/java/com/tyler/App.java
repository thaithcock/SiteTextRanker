package com.tyler;

import com.tyler.service.JSoupSiteTextGetter;
import com.tyler.service.SiteTextGetter;

import java.io.IOException;
import java.util.*;

public class App {

    static Integer TOP_NUMBER = 25;

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please pass a site url as the first and only parameter");
            System.exit(1);
        }
        System.out.println("received url: " + args[0]);

        SiteTextGetter stg = new JSoupSiteTextGetter();

        // get the text from the URL
        String text = stg.getText(args[0]);

        System.out.println(text);

        // use Scanner to count up word tokens one at a time versus needing to split the entire string, then iterate over the entire resulting array. Algorithmically, it's faster.
        Scanner sit = new Scanner(text).useDelimiter("\\W+");

        Map<String, Integer> wordMap = new HashMap<>();
        // go through the words and count them up
        while (sit.hasNext()) {
            String word = sit.next().toLowerCase();
            System.out.println("Processing " + word);
            if (wordMap.containsKey(word)) {
                System.out.println("Found " + wordMap.get(word) + " occurrances already. Adding 1");
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                System.out.println("New word!");
                wordMap.put(word, 1);
            }
        }

        System.out.println("\n\n\n");

        // output the sorted list -- limit to 25 though
        wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(TOP_NUMBER)
                .forEach(entry -> System.out.println(entry.getValue() + " - " + entry.getKey()));
    }
}
