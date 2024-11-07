package main.java.org.hogwarts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
Напишите метод public static List<String> transform(List<String> words),
который удалит у переданного списка все пустые слова,
т.е. те слова, для которых words.get(i).equals(””) вернёт true.
 */
public class Transformer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("", "a", "b", "ab", "ba", "z", "h", "", "heh", ""));
        System.out.println(transform(list));
    }

    public static List<String> transform(List<String> words) {
        for (int i = words.size() - 1; i >= 0; i--) {
            if (words.get(i).equals("")) {
                words.remove(i);
            }
        }
        return words;
    }
}
