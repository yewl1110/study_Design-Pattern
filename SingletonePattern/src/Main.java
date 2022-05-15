public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Thread(new ThreadTest2()).start();
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

class ThreadTest2 implements Runnable {

    @Override
    public void run() {
        Singleton enumSingleton = Singleton.UNIQUE_INSTANCE;
        test(enumSingleton);
    }

    public void test(Singleton chocolateBoiler) {
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
