package WarringNeighbours2;

public class Field {

    public static void main(String args[]) {
        Flags flags = new Flags();
        Thread a = new Neighbor(flags,1);
        Thread b = new Neighbor(flags,2);
        a.setName("alice");
        b.setName("bob");
        a.start();
        b.start();
    }
}
