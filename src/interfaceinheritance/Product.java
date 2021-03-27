package interfaceinheritance;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    String make;
    int price;

    public Product() {

    }
    //Tinh sum price
    int TinhTong(){
        return 10;
    }
}
