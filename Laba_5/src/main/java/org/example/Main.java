package org.example;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        String[] arrayWord = {"Car", "Котик", "Car", "Морозилка", "Котик", "Очки","Ноутбук", "Котик", "Мегафон", "Котик"};
        LinkedHashMap<String, Integer> listWord = new LinkedHashMap<String, Integer>();
        for (String s: arrayWord) {
            listWord.merge(s, 1, Integer::sum);
        }
        System.out.println(listWord.keySet());
        System.out.println(listWord.entrySet());
        System.out.println();
        Translator t = new Translator();

        t.add("Автор", "Autor");
        t.add("Автор", "Creator");

        t.add("Красивый", "Googly");

        t.add("Человек", "Human");
        t.add("Человек", "Person");
        t.add("Человек", "People");

        t.add("Код", "Code");
        t.add("Код", "Code");
      //  t.add("Автор", "Autor2");
       // t.add("Ааа", "Autor2");


        System.out.println(t.get("Человек"));
        System.out.println();
        t.printAll();

    }
}