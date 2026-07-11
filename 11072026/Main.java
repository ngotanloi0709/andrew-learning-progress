public class Main {

    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Calculator calc = new Calculator();
        
        // System.out.println(calc.isEvenNumber(5));
        // System.out.println(calc.sumEvenNumber(array));
        // System.out.println(calc.calcFactorial(5));


        Car hondaCar = new Honda("Honda Accord");
        Car bmwCar = new Bmw("BMW");

        hondaCar.run();
        bmwCar.run();


        bmwCar.engineType();
        bmwCar.engineType(true);
        hondaCar.turnOffEngine();
        bmwCar.turnOffEngine();
        hondaCar.parking();
        bmwCar.parking();
    } 
    
}
