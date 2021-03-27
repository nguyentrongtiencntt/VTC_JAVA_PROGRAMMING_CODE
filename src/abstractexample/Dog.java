package abstractexample;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Go go");
    }

    @Override
    void behaviour() {
        System.out.println("Bark");
    }
}
