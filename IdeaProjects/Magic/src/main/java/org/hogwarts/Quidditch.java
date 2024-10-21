package main.java.org.hogwarts;

import java.util.Random;

public class Quidditch {
    public void getBalls() {
        int count = 3;
        String phrase = "The ball has been thrown: ";
        for (int i = 1; i <= count; i++) {
            System.out.print(phrase);
            if (i == 1) {
                System.out.println("Quaffle");
            } else if (i == 2) {
                System.out.println("Bludger");
            } else if (i == 3) {
                System.out.println("Golden Snitch");
            }
        }
    }

    public void playGame() {
        while (true) {
            int controlNumber = new Random().nextInt(0, 100);
            System.out.println("The control number is: " + controlNumber);

            int anyNumber = 7;
            if (controlNumber == anyNumber) {
                System.out.println("Snitch has been caught!");
                break;
            }
        }
    }
}
