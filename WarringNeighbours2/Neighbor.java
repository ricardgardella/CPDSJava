package WarringNeighbours2;

public class Neighbor extends Thread {
    private Flags flags;
    private int turn;
    public Neighbor(Flags flags, int turn) {
        this.flags = flags;
        this.turn = turn;
    }

    public void run() {  //Greedy approach
        while (true) {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("try again, my name is: "+ name);
                flags.set_true(name);
                //To model greedy write the sleep as follows
                flags.setTurn(name);
                Thread.sleep((int)(200*Math.random()));
                while (flags.query_flag(name) && this.flags.getTurn() == turn) {
                    System.out.println("I am " + name +" gonna try later");
                    Thread.sleep(300);
                }
                System.out.println(name + " enter");
                Thread.sleep(400);
                System.out.println(name + " exits");
                Thread.sleep((int)(200*Math.random()));
                flags.set_false(name);
            }
            catch (InterruptedException e) {};
        }
    }
}