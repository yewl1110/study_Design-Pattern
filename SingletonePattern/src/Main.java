public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Thread(new ThreadTest()).start();
        }
    }
}

class ThreadTest implements Runnable {

    @Override
    public void run() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        test(chocolateBoiler);
    }

    public void test(ChocolateBoiler chocolateBoiler) {
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
