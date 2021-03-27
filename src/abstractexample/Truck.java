package abstractexample;

public class Truck extends Vehicle{
    private int price;
    private int km;

    public Truck(int price, int km) {
        this.price = price;
        this.km = km;
    }

    @Override
    double calMoney() {
        return price*km;
    }
}
