package Solution.OOPExcersise;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int numberOfLegs;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.numberOfLegs = 4;
    }

    public Animal(String name, int age, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void eat(String food) {
        System.out.println(this.name + " is eating " + food);
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Number of legs: " + this.numberOfLegs);
    }

    public abstract void makeSound();
    public abstract String getSpecies();
}
