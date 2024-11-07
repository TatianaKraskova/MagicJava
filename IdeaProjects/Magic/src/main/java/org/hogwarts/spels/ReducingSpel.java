package main.java.org.hogwarts.spels;

public class ReducingSpel extends Spel {

    public ReducingSpel(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    @Override
    public void doMagic() {
        System.out.println("The reducing spell " + getName() + " with effect '" + getEffect() + "' has been applied.");
    }
}
