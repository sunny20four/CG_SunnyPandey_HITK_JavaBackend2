class P3 {

    static class Node {

        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }

    Node root;


    Node insert(Node root,int value){

        if(root==null)
            return new Node(value);


        if(value < root.data)
            root.left = insert(root.left,value);

        else
            root.right = insert(root.right,value);


        return root;
    }


    void inorder(Node root){

        if(root==null)
            return;


        inorder(root.left);

        System.out.print(root.data+" ");

        inorder(root.right);
    }


    public static void main(String args[]){

        P3 tree = new P3();

        int arr[]={50,25,75,10,30,60,90};


        for(int x:arr)
            tree.root=tree.insert(tree.root,x);


        tree.inorder(tree.root);
    }
}