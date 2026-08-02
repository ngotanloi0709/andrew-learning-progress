package oopExcercise;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, 4);
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + "meowmeow");
    }
    @Override
    public String getSpecies() {
        return "cat";
    }
    public void scratch() {
        System.out.println(this.name + "is scratching the furniture");
    }
}
