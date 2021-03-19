package recursion;

import datastructure.Node;

public class MakeTree {
    private static NodeTree root;

    public static void main(String[] args) {

        //5,4,6
        root = insertRec(root, 2);
        insertRec(root, 1);
        insertRec(root, 4);
        insertRec(root, 3);
        insertRec(root, 5);

        //NLR(root);

        deleteRec(root, 1);


        System.out.println("AAAAA");
        System.out.println(minValue(root));

    }

    private static NodeTree insertRec(NodeTree roota,
                                      int key) {
        /* If the tree is empty, return a new node */
        if (roota == null) {
            roota = new NodeTree(key);
            return roota;
        }
        /* Otherwise, recur down the tree */
        if (key < roota.key)
            roota.left = insertRec(roota.left, key);
        else if (key > roota.key)
            roota.right = insertRec(roota.right, key);
        /* return the (unchanged) node pointer */
        return roota;
    }

    private static void NLR(NodeTree root) {
        if (root != null) {
            System.out.println(root.key);
            NLR(root.left);
            NLR(root.right);
        }
    }

    static int minValue(NodeTree root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    static NodeTree deleteRec(NodeTree root, int key) {
        /* Base Case: If the tree is empty */
        if (root == null) return root;
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root .key)
            root.right = deleteRec(root.right, key);
            // if key is same as root's key, then This is the node  to be deleted
        else// node with only one child or no child
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node with two children: find smallest  in the right subtree)
            root.key = minValue(root.right);
            // Delete the replacement node
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
}
