package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence.isEmpty()) {
            return map;
        }
        sentence = sentence.toLowerCase(Locale.ROOT);
        String[] words = sentence.split("\\W+");

        for (String key : words) {
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        return map;
    }
}
