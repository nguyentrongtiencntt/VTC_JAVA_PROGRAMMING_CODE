package OOP.statickeyword;

public class StaticCodeDemo {
    public static int N=10;
    int x = 5, y = 7;
    static {
        System.out.println("Static code:" + N);
    }
    int sum(){
        return x + y;
    }
    static {
        System.out.println("Static code: hello");
    }
    public static int sum(int a, int b){
        return a + b;
    }


}
