package IUH_Exercises;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0;
        diemTH = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        if(maSV<0){this.maSV=0;}
        else this.maSV = maSV;

        if(hoTen.equals("")){this.hoTen = "defaul name";}
        else this.hoTen = hoTen;

        if(diemLT<0 || diemLT>10){ diemLT = 0;}
        else this.diemLT = diemLT;

        if(diemTH<0 || diemTH>10){ diemTH = 0;}
        else this.diemTH = diemTH;
    }

    public float diemTB(){
        return (diemLT+diemTH)/2;
    }

    @Override
    public String toString() {
        String sf =
                String.format("%-5d %-15s %6.1f %6.1f %6.1f"
                        ,maSV,hoTen,diemLT, diemTH,diemTB());

        return sf;

    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if(maSV<0){this.maSV=0;}
        else this.maSV = maSV;
    }

    public String getHoten() {
        return hoTen;
    }

    public void setHoten(String hoten) {
        if(hoTen.equals(null)){this.hoTen = "defaul name";}
        else this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        if(diemLT<0 || diemLT>10){ diemLT = 0;}
        else
            this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if(diemTH<0 || diemTH>10){ diemTH = 0;}
        else this.diemTH = diemTH;
    }
}
