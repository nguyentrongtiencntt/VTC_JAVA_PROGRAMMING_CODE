package IUH_Exercises;

public class MainSinhVien {
    public static void main(String[] args) {


        String a[] = new String[]{"ID","Name","PointLT","PointPR","PointAV"};
        String firstline = String.format("%-5s %-15s %6s %6s %6s", a[0],a[1], a[2], a[3], a[4]);
        System.out.println(firstline);

        SinhVien sv1 =
                new SinhVien(1,"Ôn Kim Ngọc",5,10);
        SinhVien sv2 =
                new SinhVien(2,"Quang Cường",5,10);
        SinhVien sv3 =
                new SinhVien(3,"Mr Phú",5,10);
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
