package datastructure;

import java.util.LinkedList;

public class MainTest {
    public static void main(String[] args) {
        LinkedList<HocVien> linkedList =
                new LinkedList();
        HocVien hv = new HocVien(1,"Quang Minh",true,9.5);
        linkedList.add(hv);
        HocVien hv1 = new HocVien(2,"Quang Minh",true,9.5);
        linkedList.add(hv1);
        System.out.println("AAAAA");


    }
}
