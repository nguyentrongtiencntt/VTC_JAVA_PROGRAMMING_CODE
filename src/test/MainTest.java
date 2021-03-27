package test;

import ooppf03.Teacher;

import java.util.LinkedList;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        Student sv1=new Student(11111,"Nguyễn Thanh An",6.50,8.50);
        Student sv2=new Student(22222,"Lê Thị Bông",7.50,8.00);
        //Student sv3=new Student();
        /*System.out.println("Nhập mã số của sinh viên sv3: ");
        int id=sc.nextInt();
        sv3.setId(id);
        sc.nextLine();
        System.out.println("Nhập họ và tên của sinh viên sv3: ");
        String name=sc.nextLine();
        sv3.setName(name);
        System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
        double LT=sc.nextDouble();
        sv3.setLT(LT);
        System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
        double TH=sc.nextDouble();
        sv3.setTH(TH);*/
        System.out.println(String.format("%-10s %-20s %-10s %-10s %-10s","Mãsv","Họtên","ĐiểmLT","ĐiểmTH","ĐiểmTB"));
        System.out.println(sv1);
        System.out.println(sv2);

    }
    public static class Student{
        private int id;
        private String name;
        private double LT;
        private double TH;
        public Student(){}
        public Student(int id,String name, double LT, double TH) {
            this.setId(id);
            this.name = name;
            this.setLT(LT);
            this.setTH(TH);
        }

        public double diemTB(){
            return (LT+TH)/2;
        }

        public String toString(){
            return String.format("%-10s %-20s %-10.2f %-10.2f %-10.2f",this.id,this.name,this.LT,this.TH,this.diemTB());
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            if(id>0) this.id = id;
            else this.id=0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLT() {
            return LT;
        }

        public void setLT(double LT) {
            if(LT<0 || LT>10) this.LT=0;
            else this.LT=LT;
        }

        public double getTH() {
            return TH;
        }

        public void setTH(double TH) {
            if(TH<0 || TH>10) this.TH=0;
            else this.TH=TH;
        }
    }
}
