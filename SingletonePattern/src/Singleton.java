public enum Singleton {
    UNIQUE_INSTANCE;
    private boolean empty = true;
    private boolean boiled;

    public void fill() {
        if(isEmpty()) {
            System.out.println("재료채우기=>"+UNIQUE_INSTANCE);
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("끓인재료를 다음으로 넘김=>"+UNIQUE_INSTANCE);
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("끓이기=>"+UNIQUE_INSTANCE);
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return this.name() +"@"+this.hashCode();
    }
}
