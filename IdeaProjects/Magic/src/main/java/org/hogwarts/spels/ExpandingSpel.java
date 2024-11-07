package main.java.org.hogwarts.spels;

public class ExpandingSpel extends Spel {

    public ExpandingSpel(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    @Override
    public void doMagic() {
        System.out.println("The expanding spell " + getName() + " with effect '" + getEffect() + "' has been applied.");
    }
}
