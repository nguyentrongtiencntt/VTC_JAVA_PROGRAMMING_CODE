package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class performance {
    public static void main(String[] args) {
        ArrayList arrayList
                = new ArrayList();
        LinkedList linkedList
                = new LinkedList();
        long starttime = System.nanoTime();
        for (int i = 0; i < 100000 ; i++) {
            arrayList.add(i);
        }
        long endtime = System.nanoTime();
        long duration = endtime - starttime;
        System.out.println("ArrayList add 10000 elments: " + duration);
        starttime = System.nanoTime();
        for (int i = 0; i < 100000 ; i++) {
            linkedList.add(i);
        }

        endtime = System.nanoTime();
        duration = endtime-starttime;
        System.out.println("LinkList add 10000 elments: " + duration);



    }
}
