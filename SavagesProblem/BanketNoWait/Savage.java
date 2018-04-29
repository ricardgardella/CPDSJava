package SavagesProblem.BanketNoWait;

public class Savage extends Thread {
    BadPotTwo pot;

    public Savage(BadPotTwo pot) {
        this.pot = pot;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is hungry ... ");
            try {
                Thread.sleep(200);
                pot.getserving();
            } catch (InterruptedException e) {
            }
        }
    }
}
