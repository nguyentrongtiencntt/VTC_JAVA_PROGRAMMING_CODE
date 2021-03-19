package com.company;

import java.util.Scanner;

public class SUBJECT
{
    private String TenMonHoc;
    private float DiemLT;
    private float DiemTH;

    public SUBJECT() {
    }

    public SUBJECT(String tenMonHoc) {
        TenMonHoc = tenMonHoc;
    }

    public SUBJECT(String tenMonHoc, float diemLT, float diemTH) {
        TenMonHoc = tenMonHoc;
        DiemLT = diemLT;
        DiemTH = diemTH;
    }

    @Override
    public String toString() {
        return "MonHoc='" + TenMonHoc + '\'' +
                ", DiemLT=" + DiemLT +
                ", DiemTH=" + DiemTH ;
    }

    public float TinhDTB()
    { return 0; }

    public void NhapMonHoc(String tenMonHoc, float diemLT, float diemTH) {
        TenMonHoc = tenMonHoc;
        DiemLT = diemLT;
        DiemTH = diemTH;
    }

    public void XuatMonHoc(){
        System.out.println("Ten mon: " + TenMonHoc + " Diem LT " + DiemLT);
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        TenMonHoc = tenMonHoc;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        DiemLT = diemLT;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float diemTH) {
        DiemTH = diemTH;
    }
}