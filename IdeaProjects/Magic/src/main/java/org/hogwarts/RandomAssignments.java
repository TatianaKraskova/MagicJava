package main.java.org.hogwarts;

public class RandomAssignments {
//    public void generateSum() {
//        int sum = 0;
//        for (int i = 222; i <= 444; i = i + 2) {
//            sum = sum + i;
//        }
//        System.out.println("sum is: " + sum);
//    }

    // Четвертое задание
    // Попробуем написать небольшой алгоритм. Все необходимые инструменты мы уже прошли. За подсказками попробуйте обратиться к предыдущим урокам.
    // Создайте массив из 5 целых чисел.
    // Напишите код для нахождения наименьшего и наибольшего элемента в массиве.
    // Выведите эти элементы в консоль.

    public void forthTask() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(" the max num is: " + max + " and the min num is: " + min);
    }


}

