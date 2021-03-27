package abstractexample;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Meo meo");
    }

    @Override
    void behaviour() {
        System.out.println("Clim!");
    }
}
