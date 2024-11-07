package main.java.org.hogwarts.spels;

public abstract class Spel {
    private String name;
    private String effect;
    private boolean status;

    public Spel(String name, String effect, boolean status) {
        this.name = name;
        this.effect = effect;
        this.status = status;
        System.out.println("Spell: " + name + " has been created: " + status + " and has following effect: " + effect );
    }

    public abstract void doMagic();

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public String getEffect() {
        return effect;
    }
}


