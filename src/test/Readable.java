package test;

public interface Readable {
    public abstract void read();
    default void Sum(int a, int b){
        read();
    }

}

class R implements Readable {

    @Override
    public void read() {

    }

    public static void main(String[] args) {
        R r = new R();
        r.Sum(5, 7);

    }
}
