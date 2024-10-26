package main.java.org.hogwarts;

import java.util.Random;

public class Spell {
    // fields:
    private String title;
    private int power;

    // constructor:
    public Spell(String title, int power){
        this.title = title;
        this.power = power;
    }

    // getters:
    public String getTitle(){
        return title;
    }

    public int getPower() {
        return power;
    }

    // setters:
    public void setPower(int power) {
        this.power = power;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
