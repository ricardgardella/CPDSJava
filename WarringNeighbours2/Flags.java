package WarringNeighbours2;

public class Flags {
    private boolean flag_alice;
    private boolean flag_bob;
    private int turn;
    public Flags() {
        flag_alice = false;
        flag_bob = false;
        this.turn = 1;
    }
    public synchronized boolean query_flag(String s) {
//no condition synchronization is needed
        if (s.equals("alice")) return flag_bob;
        return flag_alice;
    }
    public synchronized void set_true(String s) {
//no condition synchronization is needed
        if (s.equals("alice")) { flag_alice = true;}
        else { flag_bob = true; }
    }
    public synchronized void set_false(String s) {
//no condition synchronization is needed
        if (s.equals("alice")) { flag_alice = false; }
        else { flag_bob = false; }
    }

    public synchronized void setTurn(String name) {
        if (name.equals("alice")) { turn = 1;}
        else { turn = 2;}
    }

    public synchronized int getTurn() {
        return this.turn;
    }
}
