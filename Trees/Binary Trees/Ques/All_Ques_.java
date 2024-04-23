import java.util.*;

public class All_Ques_ {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // root node:
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (idx >= nodes.length || nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    // Height of a binary tree:
    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            // Height of tree is maximum of left subtree height and right subtree height + 1
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Sum of Nodes:
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return root.data + leftSum + rightSum;
        }
    }

    // Count of Nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    // Diameter of Binary Tree - 1st approach [O(n^2)]
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);

            return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
        }
    }

    // Subtree of another Tree

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null)
            return true;
        if (node == null || subRoot == null)
            return false;

        // Check if the current node of the main tree and the subtree have the same
        // value
        // If yes, recursively check if their left and right subtrees are identical

        return node.data == subRoot.data &&
                isIdentical(node.left, subRoot.left) &&
                isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) // If subRoot is null, it's always a subtree
            return true;

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Check if the subtree exists in the left or right subtree of the current node
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Top View of the Tree

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // Level Order
        Queue<Info> q = new LinkedList<Info>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.hd)) // first time my hd is occuring
                    map.put(curr.hd, curr.node);

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data + " ");
        }

    }

    public static void main(String[] args) {
        // int nodes[] = { 3, 4, 5, 1, 2 };
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };

        /**
         * 2
         * / \
         * 4 5
         */
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        All_Ques_ T = new All_Ques_();
        int treeHeight = height(root);
        System.out.println("Height of the tree: " + treeHeight);

        // int nodeCount = countNodes(root);
        // System.out.println("Number of nodes: " + nodeCount);

        // int sumNodes = sum(root);
        // System.out.println("Sum of nodes: " + sumNodes);

        // int diameter = diameter(root);
        // System.out.println("Diameter of the tree: " + diameter);

        // boolean isSubtree = isSubtree(root, subRoot);
        // System.out.println("Is subtree: " + isSubtree); // it should print TRUE, but
        // its returning false.

        topView(root);

    }
}
