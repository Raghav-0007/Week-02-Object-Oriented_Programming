package assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        // Create object for Dog class
        Dog dog=new Dog();

        // Create object for Cat class
        Cat cat=new Cat();

        // Create object for Bird class
        Bird bird=new Bird();

        // Calling the make sound method
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
