package test;

import java.util.PrimitiveIterator;

public class testNode {

    private static Node Head = null;
    public static void main(String[] args) {

        insertHead(9);
        insertHead(4);
        insertHead(6);
        insertHead(5);
        insertHead(7);

        Node p = Head;
        while (p!=null){
            System.out.print(p.Data + " ");
            p = p.Next;
        }



    }
    static void insertHead(int x){
        if(Head==null){
            Head = new Node(x);
        } else {
            Node node = new Node(x);
            node.Next = Head;
            Head = node;
        }

    }

}
