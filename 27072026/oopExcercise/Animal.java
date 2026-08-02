package oopExcercise;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int numberOfLegs;

    public Animal() {
        this.name =  "Unknown";
        this.age = 0;
        this.numberOfLegs = 4;
    }
    public Animal(String name, int age, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }
    // name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // age
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
    // number of legs
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
    public void setNumberOfLegs(int leg) {
        this.numberOfLegs = leg;
    }
    // eat
    public void eat() {
        System.out.println(this.name + " is eating ");
    }
    public void eat(String food) {
        System.out.println(this.name + " is eating " + food);
        
    }
    // show info
    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.numberOfLegs);
    }
    // make sound
    public abstract void makeSound();
    public abstract String getSpecies();
}
