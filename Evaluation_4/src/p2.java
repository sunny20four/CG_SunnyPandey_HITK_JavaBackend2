class p2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
        Node root;

    Node insert(Node root,int value) {
        if (root == null)
            return new Node(value);
        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        return root;
    }
        boolean search(Node root,int key) {
            if (root == null)
                return false;
            if (root.data == key)
                return true;
            if (key < root.data)
                return search(root.left, key);
            return search(root.right, key);
        }
        public static void main(String args[]) {
            p2 tree = new p2();
            int arr[] = {40, 20, 60, 10, 30, 50, 70};

            for (int x : arr)
                tree.root = tree.insert(tree.root, x);
            int key = 50;
            System.out.println(tree.search(tree.root, key) ? "Element Found" : "Element not found");
        };
    }
