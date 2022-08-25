package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (map.get(value) == null) {
                map.put(value,key);
            } else {
                map.put(value, Integer.min(map.get(value),key));
            }
        }
        return map;
    }
}
