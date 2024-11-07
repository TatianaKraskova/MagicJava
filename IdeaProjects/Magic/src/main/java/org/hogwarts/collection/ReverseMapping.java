package main.java.org.hogwarts.collection;
/*
Второе задание
Вам дана HashMap, которая содержит отображение столиц на страны.
Создайте новый HashMap с названием countryCapitalMap, который будет содержать отображение стран на столицы.
То есть такой же, но наоборот!

 */

import java.util.HashMap;
import java.util.Map;

public class ReverseMapping {
    public static void main(String[] args) {
        HashMap<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("Paris", "France");
        capitalCountryMap.put("Berlin", "Germany");
        capitalCountryMap.put("Rome", "Italy");

        // Print original capitalCountryMap
        System.out.println("Original capitalCountryMap:");
        for(Map.Entry<String, String> entry : capitalCountryMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Create countryCapitalMap by reversing capitalCountryMap
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        for (Map.Entry<String, String> entry : capitalCountryMap.entrySet()) {
            String capital = entry.getKey();
            String country = entry.getValue();
            countryCapitalMap.put(country, capital);
        }

        // Print reversed countryCapitalMap
        System.out.println("\nReversed countryCapitalMap:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}




