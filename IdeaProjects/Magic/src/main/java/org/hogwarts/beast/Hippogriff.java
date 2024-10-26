package main.java.org.hogwarts.beast;

import main.java.org.hogwarts.Student;
import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private boolean specialSkill;

    public Hippogriff() {
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(int age) {
        this.age = age;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(String name, int age, String color, boolean specialSkill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.specialSkill = specialSkill;
    }

    // getters:
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean isSpecialSkill() {
        return specialSkill;
    }

    // setters:
    public void setName(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")) {
            System.out.println(this.name + " is happily eating the meat!");
        } else {
            System.out.println(this.name + " refuses to eat " + food + ".");
        }
    }

    public String fly() {
        if (this.age > 2) {
            System.out.println(this.name + " is flying!");
            return this.name + this.name + " is flying!";

        } else {
            System.out.println(this.name + " is too young and can`t fly");
            return this.name + " is too young and can`t fly";
        }
    }

    public String giveRide(Student student) {
        int isGivingRide = new Random().nextInt(1, 11); // Random number from 1 to 10
        if (isGivingRide <= 3) {
            return student.getName() + " is riding on the " + this.name + "!";
        } else if (isGivingRide >= 4 && isGivingRide <= 8) {
            System.out.println(this.name + "  turns away and refuses to give a ride.");
            return this.name + " turns away and refuses to give a ride.";
        } else {
            System.out.println(this.name + " says " + student.getName() +  " try again!");
            return this.name + " says " + student.getName() +  " try again!";
        }
    }
}
