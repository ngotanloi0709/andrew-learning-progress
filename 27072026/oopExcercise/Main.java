package oopExcercise;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Kitty", 2);
        dog.showInfo();
        cat.showInfo();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
        dog.eat("bone");
        cat.eat("fish");
        dog.learn("shake hand");
        System.out.println(dog.isTrained());
        dog.fetch();
        cat.scratch();
        dog.setAge(-5);
        System.out.println(dog.getAge());
    }
}
