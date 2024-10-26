package main.java.org.hogwarts.items;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;

    public Cloak(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public void becomeInvisible() {
        System.out.println(capacity + " persons are invisible under the cloak. The weight is " + weight);
    }

    @Override
    public void becomeVisible() {
        System.out.println(capacity + " persons are visible under the cloak. The weight is " + weight);
    }
}
