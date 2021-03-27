package abstractexample;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();

        Vehicle truck = new Truck(10,12);
        System.out.println(truck.calMoney());

        Vehicle taxi = new Taxi(10,12, 10);
        System.out.println(taxi.calMoney());




    }
}
