package main.java.org.hogwarts.collection;

import java.util.HashSet;
import java.util.List;

/*
Вам дан список.
С помощью Set удалите дубликаты из списка, и выведите на экран получившееся множество.

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 5);
        // Напишите свой код здесь
    }
}
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 5);
        System.out.println("numbers: " + numbers);

        HashSet<Integer> allNumbersInHashSet = new HashSet<>(numbers);
        /*
        or could be done:
        HashSet<Integer> allNumbersInHashSet = new HashSet<>();
        allNumbersInHashSet.addAll(numbers);
         */
        System.out.println("All numbers in a HashSet: " + allNumbersInHashSet);
    }
}
