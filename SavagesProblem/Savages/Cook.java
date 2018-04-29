package SavagesProblem.Savages;

public class Cook extends Thread {
    Pot pot;
    public Cook(Pot pot) {

          this.pot=pot;
    }
    public void run() {
        while (true) {
            try {
               // this.sleep(200);
                System.out.println("Cook wants to fill the pot");
                pot.fillpot();
            }
            catch(Exception e) {System.out.println(e.getMessage());};
        }
    }
}
