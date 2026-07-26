package Solution.OOPExcersise;

public class Dog extends Animal implements Trainable {
    private boolean trained = false;

    public Dog(String name, int age) {
        super(name, age, 4);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + ": Woof! Woof!");
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public void learn(String trick) {
        this.trained = true;
        System.out.println(this.name + " learned: " + trick + "!");
    }

    @Override
    public boolean isTrained() {
        return this.trained;
    }

    public void fetch() {
        System.out.println(this.name + "is fetching the ball!");
    }
}
