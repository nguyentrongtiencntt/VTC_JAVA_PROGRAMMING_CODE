package OOP;

import java.util.ArrayList;

public class ToaDo {
    private int x;
    private int y;


    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public ToaDo() {
        this(0,0);
    }

    public int sum(int x, int y){
        return x + y;
    }
    public int result(){
        int a = sum(0, 0);
        ArrayList arrayList
                = new ArrayList();

        return a;
    }
}