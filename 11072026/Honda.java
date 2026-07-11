public class Honda extends Car {
    public Honda(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("The Honda runs 100KM/hour");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Honda turned off engine");
    }

    @Override
    public void parking() {
        System.out.println("Honda is parking");
    }
}