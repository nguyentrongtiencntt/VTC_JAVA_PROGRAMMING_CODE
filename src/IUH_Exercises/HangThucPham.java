package IUH_Exercises;

import java.time.LocalDateTime;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private int donGia;
    //private LocalDateTime ngaySanXuat;
    //private LocalDateTime ngayHetHan;

    public HangThucPham(String maHang, String tenHang, int donGia, LocalDateTime ngaySanXuat, LocalDateTime ngayHetHan) throws Exception {
        if(maHang.equals("")) {
            throw new Exception("maHang is not null!");
        } else this.maHang = maHang;

        if(tenHang.equals("")){
            tenHang ="xxx";
        } else this.tenHang = tenHang;

        if(donGia<0){
            this.donGia = 0;
        } else this.donGia = donGia;

        //this.ngaySanXuat = ngaySanXuat;
        //this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {

        String s1 = "HangThucPham{" +
                "maHang='" + maHang + '\'' ;

        String s2 = ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                '}';

        return s1 + s2;

    }

    public HangThucPham(String maHang) throws Exception {

        if(maHang.equals("")) {
            throw new Exception("maHang is not null!");
        } else this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang.equals("")){
            tenHang ="xxx";
        } else this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        if(donGia<0){
            this.donGia = 0;
        } else this.donGia = donGia;
    }

//    public LocalDateTime getNgaySanXuat() {
//        return ngaySanXuat;
//    }
//
//    public void setNgaySanXuat(LocalDateTime ngaySanXuat) {
//        this.ngaySanXuat = ngaySanXuat;
//    }

//    public LocalDateTime getNgayHetHan() {
//        return ngayHetHan;
//    }

//    public void setNgayHetHan(LocalDateTime ngayHetHan) {
//        this.ngayHetHan = ngayHetHan;
//    }
}
