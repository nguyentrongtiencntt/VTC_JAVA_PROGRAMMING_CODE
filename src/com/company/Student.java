package com.company;

public class Student {
    private String name;
    private int diemToan;
    private int diemVan;
    private int diemAnh;

    public Student(String name, int diemToan,
                   int diemVan, int diemAnh) {
        this.name = name;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public void DiemTB(){
        double diemtb = (diemToan+diemAnh+diemVan);

        System.out.println("Diem trung binh: "
                + name + " " + diemtb);
    }

}
