package org.example;

import java.util.*;

public class Translator {
    private final Map<String, LinkedHashSet<String>> trans;

    public Translator() {
        trans = new LinkedHashMap<>();
    }
    public void add (String word, String translation) {
        // trans.computeIfAbsent(word, k -> new LinkedHashSet<>()).add(translation);

            if (trans.containsKey(word)) {
                trans.get(word).add(translation);
            } else {
                LinkedHashSet<String> set = new LinkedHashSet<>();
                set.add(translation);
                trans.put(word, set);
            }
        }


    public String get(String word) {
        LinkedHashSet<String> translation = trans.get(word);
        if (translation != null) {
            return String.join(", ", translation);
        } else {
            return "Перевода нет ";
        }
    }
    public void printAll() {
        System.out.println(trans.entrySet());
    }
}
