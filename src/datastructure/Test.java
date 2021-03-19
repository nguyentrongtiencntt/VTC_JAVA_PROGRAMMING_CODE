package datastructure;

public class Test {
    private static Node Head = null;

    public static void main(String[] args) {
        InsertBeginning(3);
        InsertBeginning(4);
        InsertBeginning(5);
        InsertBeginning(6);
        InsertBeginning(7);
        InsertEnd(8);
        InsertEnd(9);
        Node p = Head;
        while (p.Data!=4){
            p = p.Next;
        }
        Node n9 = new Node(9);
        n9.Next = p.Next;
        p.Next = n9;
        System.out.println("AAAAA");

    }
    private static void InsertBeginning(int x){
        if(Head==null){
            Head = new Node(x);
        }else {
            Node node = new Node(x);
            node.Next = Head;
            Head = node;
        }
    }
    private static void InsertEnd(int x){
        if(Head==null){
            Head = new Node(x);
        } else {
            Node p = Head;
            while (p.Next!=null){
                p = p.Next;
            }
            Node node8 = new Node(x);
            p.Next = node8;
        }
    }


}
