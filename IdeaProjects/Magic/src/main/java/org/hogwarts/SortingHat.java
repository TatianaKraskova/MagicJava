package main.java.org.hogwarts;

import java.util.Scanner;

public class SortingHat {
    public void sort() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ты предпочитаешь работать в команде? (yes/no)");
        String answer1 = scanner.nextLine();

        System.out.println("Ты любишь разгадывать головоломки? (yes/no)");
        String answer2 = scanner.nextLine();

        System.out.println("Ты идешь на риск, чтобы достичь своей цели? (yes/no)");
        String answer3 = scanner.nextLine();

        System.out.println("Ты проявляешь заботу к существам и природе? (yes/no)");
        String answer4 = scanner.nextLine();

        if (answer1.equals("yes")) {
            if (answer3.equals("yes")) {
                System.out.println("Гриффиндор");
            } else if (answer4.equals("yes")) {
                System.out.println("Пуффендуй");
            } else if (answer2.equals("yes")) {
                System.out.println("Когтевран");
            } else {
                System.out.println("Слизерин");
            }
        } else {
            if (answer3.equals("yes")) {
                System.out.println("Слизерин");
            } else {
                System.out.println("Пуффендуй");
            }
        }
        scanner.close();
    }
}





