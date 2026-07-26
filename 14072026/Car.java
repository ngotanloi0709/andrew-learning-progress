public abstract class Car implements CarMethod {
    String brand = "No brand";

    public Car() {
        // 
    }

    public Car(String brand) {
        this.brand = brand;
    }


    public void run() {
        System.out.println("The car runs 50KM/hour");
    }

    public void engineType() {
        System.out.println("this car is gasoline");
    }

    public void engineType(boolean isDiesel) {
        if (isDiesel) System.out.println("this car is diesel");
    }

    public abstract void turnOffEngine();
}
