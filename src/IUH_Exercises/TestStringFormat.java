package IUH_Exercises;

public class TestStringFormat {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String sf1=
                String.format("Number first |%10d| and second |%10d|",x , y);
        System.out.println(sf1);
        int d = 101;
        int c = 200;
        String sf2=
                String.format("Number first |%10d| and second |%10d|",c , d);
        System.out.println(sf2);

    }
}
