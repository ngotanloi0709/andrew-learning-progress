public class Bmw extends Car {
    public Bmw(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("The Bmw runs 200KM/hour");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("BMW turned off engine");
    }

    @Override
    public void parking() {
        System.out.println("BMW is parking");
    }
}