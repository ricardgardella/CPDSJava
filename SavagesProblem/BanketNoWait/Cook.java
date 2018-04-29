package SavagesProblem.BanketNoWait;

public class Cook extends Thread {
    BadPotTwo pot;
    public Cook(BadPotTwo pot) {

          this.pot=pot;
    }
    public void run() {
        while (true) {
            try {
                this.sleep(200);
                System.out.println("Cook wants to fill the pot");
                pot.fillpot();
            }
            catch(Exception e) {System.out.println(e.getMessage());};
        }
    }
}
