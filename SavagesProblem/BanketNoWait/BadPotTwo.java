package SavagesProblem.BanketNoWait;
public class BadPotTwo {
    private int servings = 0;
    private int capacity;
    public BadPotTwo(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void getserving() throws InterruptedException {
        if (servings == 0) {
            System.out.println(Thread.currentThread().getName() + " go walk");
        }
        else {
            Thread.sleep(200);
            --servings;
            System.out.println(Thread.currentThread().getName()+ " is served");
            print_servings();
        }
    }
    public synchronized void fillpot() throws InterruptedException {
        if (servings > 0){
            System.out.println("Cook go walk");
        }
        else {
            servings = capacity;
            System.out.println("Cook refills");
        }
    }
    public synchronized void print_servings() {
        System.out.println("servings in the pot: " + servings);
    }
}