class Node2 {

    int data;
    Node next;


    Node2(int data) {

        this.data=data;
    }
}


public class p10 {


    boolean hasCycle(Node head) {

        Node slow=head;
        Node fast=head;


        while(fast!=null &&
                fast.next!=null) {

            slow=slow.next;

            fast=fast.next.next;


            if(slow==fast)
                return true;
        }

        return false;
    }


    public static void main(String[] args) {


        p10 obj=new p10();


        Node head=new Node(1);

        head.next=new Node(2);

        head.next.next=new Node(3);


        head.next.next.next=head;


        System.out.println(
                obj.hasCycle(head));
    }
}