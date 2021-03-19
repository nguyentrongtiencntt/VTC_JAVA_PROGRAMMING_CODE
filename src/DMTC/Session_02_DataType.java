package DMTC;

public class Session_02_DataType {
    public static void main(String[] args) {
        char c = 'a';

        int cValue = c;
        System.out.println(cValue);

        int maxValue = Character.MAX_VALUE;
        int minValue = Character.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);

        System.out.println("Stop!");

        byte x = 5;
        System.out.println("Binary "
                + Integer.toBinaryString(x));
        System.out.println("Binary "
                + Integer.toBinaryString(~x));
        int B1 = 0x01;
        int B2 = 0x02;
        int B10 = 0x0A;
        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B10);






    }
}
