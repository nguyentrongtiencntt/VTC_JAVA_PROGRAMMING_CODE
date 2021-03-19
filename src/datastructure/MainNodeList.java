package datastructure;

public class MainNodeList {
    private static NodeList Head;

    public static void main(String[] args) {
        //5,4,6
        insertBegin(5);
        insertBegin(4);
        insertBegin(6);
        insertEnd(7);
        insertSpecific(4, 3);
        removeSpecific(3);
        System.out.println(Search(4));
    }
    private static void removeSpecific(int x){
        NodeList p = Head;
        NodeList q = p.Next;
        while (q.Data!=x){
            p = q;
            q = q.Next;
        }
        p.Next = q.Next;
        q.Next = null;
        q = null;
        p =null;
    }

    private static int Search(int x) {
        NodeList p = Head;
        if (Head == null) return -1;
        else {
            while (p !=null && p.Data != x) {
                p = p.Next;
            }
            //p stop at position p.Data = x
            //p=null
            if(p==null) return -1;
            else return 1;
        }
    }

    private static void insertBegin(int x) {
        if (Head == null) {
            Head = new NodeList(5);
        } else {
            NodeList p = new NodeList(x);
            p.Next = Head;
            Head = p;
        }
    }

    private static void insertEnd(int x) {
        if (Head == null) {
            Head = new NodeList(x);
        } else {
            NodeList p = Head;
            while (p.Next != null) {
                p = p.Next;
            }
            NodeList node = new NodeList(x);
            p.Next = node;
            p = null;

        }
    }

    private static void insertSpecific(int v, int x) {
        NodeList p = Head;
        while (p.Data != v) {
            p = p.Next;
        }
        NodeList node = new NodeList(3);
        node.Next = p.Next;
        p.Next = node;
        node = null;
    }
}
