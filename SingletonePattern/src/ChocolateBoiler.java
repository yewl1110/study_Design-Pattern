public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    public synchronized static ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if(isEmpty()) {
            System.out.println("재료채우기=>"+instance);
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("끓인재료를 다음으로 넘김=>"+instance);
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("끓이기=>"+instance);
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
