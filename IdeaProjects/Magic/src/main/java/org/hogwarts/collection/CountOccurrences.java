package main.java.org.hogwarts.collection;

import java.util.HashMap;
import java.util.Map;

/*
#1
 * Вам дан массив, напишите алгоритм, который посчитает количества уникальных чисел используя HashMap.
 * В итоге должен получиться словарь [1->3, 2->2, 3->2, 4->2, 5]
 */

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3, 4, 5, 1};

        // Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>(); // create HashMap: key-order, value-int from the array

        // Create a HashMap
        for (int i = 0; i < arr.length; i++) {
            // get the current number
            int num = arr[i];
            // increment the count in the map
            map.put(num, map.getOrDefault(i, 0) + 1);
        }

        // Iterate through the HashMap
        System.out.println(" Iterate through the HashMap:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer index = entry.getKey();
            Integer value = entry.getValue();
             // System.out.println("Order: " + entry.getKey() + ", Value: " + entry.getValue());
             System.out.println(entry.getKey() + " -> " + entry.getValue());
             // System.out.println("Order: " + index + ", Value: " + value);
        }
    }
}