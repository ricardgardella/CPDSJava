package WarringNeighbour;

public class Neighbor extends Thread {
    private Flags flags;
    public Neighbor(Flags flags) {
        this.flags = flags;
    }
    /*public void run() {
        while (true) {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("try again, my name is: "+ name);
                Thread.sleep((int)(200*Math.random()));
                flags.set_true(name);
                if (!flags.query_flag(name)) {
                    System.out.println(name + " enter");
                    Thread.sleep(400);
                    System.out.println(name + " exits");
                }
                Thread.sleep((int)(200*Math.random()));
                flags.set_false(name);
            }
            catch (InterruptedException e) {};
        }
    }*/

    public void run() {  //Greedy approach
        while (true) {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("try again, my name is: "+ name);
                flags.set_true(name);
                //To model greedy write the sleep as follows
                Thread.sleep((int)(200*Math.random()));
                if (!flags.query_flag(name)) {
                    System.out.println(name + " enter");
                    Thread.sleep(400);
                    System.out.println(name + " exits");
                }
                Thread.sleep((int)(200*Math.random()));
                flags.set_false(name);
            }
            catch (InterruptedException e) {};
        }
    }
}