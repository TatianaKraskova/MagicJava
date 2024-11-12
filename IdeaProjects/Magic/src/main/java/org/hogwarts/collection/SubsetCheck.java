package main.java.org.hogwarts.collection;

/*
Второе задание
Вам даны 2 множества.
Вычислите, содержится ли второе множество внутри первого множества.
То есть является ли второе множество подмножеством первого.
*/
import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(3);

        if (set1.containsAll(set2)) {
            System.out.println("Set2 is included into the Set1");
        } else {
            System.out.println("Set2 is not a subset of Set1");
        }

//        not correct!
//        Specifically, the nested loop you are using only checks if there are common elements between set1 and set2, not if set2 is a subset of set1.
//        To properly check if set2 is a subset of set1, you can use the containsAll method provided by Java's Set interface.

//        for (Integer num1 : set1) {
//            for (Integer num2 : set2) {
//                if (num2.equals(num1))
//                    System.out.println("Set2 is included into the Set1");
//            }
//        }

				// Напишите свой код здесь
    }
}