package scjp.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        try {
            checkTuoi();
        } catch (AgeCheckingException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void checkTuoi() throws Exception {
         int tuoi = nhapTuoiNhanVien();
    }
    private static int nhapTuoiNhanVien()
                    throws AgeCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int tuoi = 0;
        try {
            tuoi = scanner.nextInt();
            if (tuoi < 0) throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
        } catch (InputMismatchException e) {

                throw new AgeCheckingException("tuổi phải là một số.");

        }
        return tuoi;
    }
}



