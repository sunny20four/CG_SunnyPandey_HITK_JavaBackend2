class Node1 {

    int data;
    Node next;


    Node1(int data) {

        this.data=data;
        next=null;
    }
}


public class p9 {


    Node reverse(Node head) {

        Node prev=null;

        Node curr=head;


        while(curr!=null) {

            Node next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;
        }

        return prev;
    }


    void print(Node head) {

        while(head!=null) {

            System.out.print(head.data+" ");

            head=head.next;
        }
    }


    public static void main(String[] args) {

        p9 obj=new p9();


        Node head=new Node(1);

        head.next=new Node(2);

        head.next.next=new Node(3);

        head.next.next.next=new Node(4);


        head=obj.reverse(head);


        obj.print(head);
    }
}