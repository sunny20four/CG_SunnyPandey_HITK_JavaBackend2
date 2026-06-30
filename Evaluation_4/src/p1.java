class P1 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Node insert(Node root, int value) {

        if (value < 0)
            throw new IllegalArgumentException("Invalid input");

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);

        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        P1 tree = new P1();

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr)
            tree.root = tree.insert(tree.root, x);

        tree.inorder(tree.root);
    }
}