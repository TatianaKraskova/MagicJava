package main.java.org.hogwarts;

import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public void prepare() {
        String[] ingredients = new String[3];
        ingredients[0] = "Драконий коготь";
        ingredients[1] = "Лист мандрагоры";
        ingredients[2] = "Корень шершавой астрелии";
        // Драконий коготь, Лист мандрагоры, Корень шершавой астрелии
        // Step 2: Create the array of required ingredients
        // String[] ingredients = {
        //                "Драконий коготь",
        //                "Лист мандрагоры",
        //                "Корень шершавой астрелии"
        // };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в лабораторию зелий!, Введите ингредиенты, которые у вас есть (через запятую): ");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println("just added user Ingredients are: " + Arrays.toString(userIngredients));

        int count = 0;
        for (String required : ingredients) {
            for (String userAdded : userIngredients) {
                if (required.equals(userAdded.trim())) {
                    count++;
                    break;
                }
            }
        }
        if (count == ingredients.length) {
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        } else {
            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
        }
    }
}

//        int ingrLength = ingredients.length;
//        int userIngredientsLength = userIngredients.length;
//        System.out.println("ingredients length: " + ingrLength);
//        System.out.println("user Ingredients length: " + userIngredientsLength);

//        if (Arrays.equals(ingredients, userIngredients)) {
//            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
//        } else {
//            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
//        }

