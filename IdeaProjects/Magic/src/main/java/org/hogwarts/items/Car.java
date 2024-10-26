package main.java.org.hogwarts.items;

import main.java.org.hogwarts.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean isFlying;

    // constructor
    public  Car (Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    // getter for isFlying
    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public void becomeInvisible() {
        System.out.println("The car is now invisible. Driver: " + this.driver.getName() + " ,speed: " + speed);
    }

    @Override
    public void becomeVisible() {
        System.out.println("The car is now visible. Driver: " + this.driver.getName() + " ,speed: " + speed);
    }
}
