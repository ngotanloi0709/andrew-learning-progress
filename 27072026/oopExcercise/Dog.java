package oopExcercise;

public class Dog extends Animal implements Trainable {
    private boolean trained = false;
    
    public Dog(String name, int age) {
        super(name, age, 4);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + "woofwoof");
    }

    @Override
    public String getSpecies() {
        return "dog";
    }
    @Override
    public void learn(String trick) {
        System.out.println(this.name + "learned" + trick);
        this.trained = true;
    }
    @Override
    public boolean isTrained() {
        return this.trained;
    }
    public void fetch() {
        System.out.println(this.name + "is fetching ball");
    }
}
