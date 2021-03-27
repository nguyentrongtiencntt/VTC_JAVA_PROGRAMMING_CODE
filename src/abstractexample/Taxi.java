package abstractexample;

public class Taxi extends Vehicle {
    private int price;
    private int km;
    private int tax;

    public Taxi(int price, int km) {
        this.price = price;
        this.km = km;
    }

    public Taxi(int price, int km, int tax) {
        this.price = price;
        this.km = km;
        this.tax = tax;
    }

    @Override
    double calMoney() {
        return price*km + tax;
    }
}
