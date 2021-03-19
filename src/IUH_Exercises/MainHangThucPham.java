package IUH_Exercises;

import java.util.Scanner;

public class MainHangThucPham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hang is: ");
        String maHang = sc.nextLine();
        HangThucPham htp = null;

        try {
             htp = new HangThucPham(maHang);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());

        }

        System.out.println(htp);
    }
}
