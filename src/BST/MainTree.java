package BST;

import test.Node;

public class MainTree {
    private static NodeTree root = null;

    public static void main(String[] args) {
        //2,1,4,5,3
        root = insertNode(root, 2);
        insertNode(root, 1);
        insertNode(root, 4);
        insertNode(root, 5);
        insertNode(root, 3);

        System.out.println("AAAAA");
        Traversal(root);
        NodeTree p = Search(root, 3);
        if(p!=null){
            System.out.println("Found");
        } else System.out.println("Not found!");


    }

    private static NodeTree insertNode(NodeTree roota,
                                       int item) {
        NodeTree a = null;
        if (roota == null){
                return roota = new NodeTree(item);
            }
        if (item < roota.key)
                roota.left =
                        insertNode(roota.left, item);
        else
                roota.right =
                        insertNode(roota.right, item);

        return roota;
    }
    private static void Traversal(NodeTree root) {

        if (root != null) {
            System.out.println(root.key);
            Traversal(root.left);
            Traversal(root.right);
        }
    }
    private static NodeTree Search(NodeTree root, int key){
        if(root==null||root.key== key){
            return root;
        }
        // val is greater than root's key
        if (root.key > key)
            return Search(root.left, key);
        // val is less than root's key
        return Search(root.right, key);

    }
}
