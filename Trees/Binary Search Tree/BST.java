import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    

    // Search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Delete a Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);

        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 - Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - Single Node
            if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            // case 3 - Both childrens
            Node succ = findInorderSuccessor(root);

            root.data = succ.data;
            root.right = delete(root.right, succ.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print In Range (k1 <----> k2)
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // Root -> Leaf Path
    public static void printPath(ArrayList<Integer> path) {
        for (int i : path) {
            System.out.print(i + " ");
        }
        System.out.println("null");
    }

    public static void Root2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;

        path.add(root.data);
        // when ended at the leaf Node, just simply print the path.
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }

        Root2Leaf(root.left, path);
        Root2Leaf(root.right, path);
        path.remove(path.size() - 1);

    }

    // Validate BST
    public static boolean isValidBst(Node root, Node min, Node max) {
        if(root == null) return true;
    
        if(min != null && root.data <= min.data) return false;
    
        if(max != null && root.data >= max.data) return false;
    
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }
    

    // Mirror a BST
    public static Node MirrorBST(Node root) {
        if(root == null) return null;
        Node leftS = MirrorBST(root.left);
        Node rightS = MirrorBST(root.right);

        // Swapping of Child Nodes
        root.left = rightS;
        root.right = leftS;
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

         // ------------------------------------------------------------------------------
        //  Inorder Traversal

        // for (int val : values) {
        //     root = insert(root, val);
        // }

        // System.out.println("Inorder Traversal of BST: ");
        // inOrderTraversal(root);

        // ------------------------------------------------------------------------------
        // System.out.println("\n\nSearching for 4 in BST: ");
        // if (search(root, 4)) {
        // System.out.println("4 is present in BST");
        // } else {
        // System.out.println("4 is not present in BST");
        // }

        // System.out.println("\nSearching for 6 in BST: ");
        // if (!search(root, 6)) {
        // System.out.println("6 is not present in BST\n");
        // } else {
        // System.out.println("6 is present in BST\n");
        // }

        // ------------------------------------------------------------------------------

        // root = delete(root, 1);
        // System.out.println("\nInorder Traversal of BST after deleting 1: ");
        // inOrderTraversal(root);

        // ------------------------------------------------------------------------------

        // System.out.println("\n\nPrinting in range 5 to 12: ");
        // printInRange(root, 5, 12);

        // ------------------------------------------------------------------------------
        // System.out.println("\n\nRoot to Leaf Paths: ");
        // Root2Leaf(root, new ArrayList<>());
        // ------------------------------------------------------------------------------

        // System.out.println("\n\nValidating BST: ");
        // if(isValidBst(root, null, null)) {
        //     System.out.println("BST is Valid");
        // } else {
        //     System.out.println("BST is not Valid");

        // }


        // ------------------------------------------------------------------------------
            System.out.println("\n\nMirroring BST: ");
            root = MirrorBST(root);
            preOrderTraversal(root);




        // ------------------------------------------------------------------------------




        // ------------------------------------------------------------------------------

    }
}