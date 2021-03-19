package recursion;

public class basic_01 {
    public static void main(String[] args) {
          in(3);
    }
    private static void in(int n){
        if(n==1) System.out.print("*");
        else {
            System.out.print("*");
            in(n-1);
        }
    }




}
