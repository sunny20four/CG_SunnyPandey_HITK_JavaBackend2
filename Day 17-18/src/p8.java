class Node {

    int data;
    Node next;


    Node(int data) {

        this.data=data;
        next=null;
    }
}


public class p8 {

    Node head;


    void insertAtHead(int data) {

        Node n=new Node(data);

        n.next=head;

        head=n;
    }


    void insertAtTail(int data) {

        Node n=new Node(data);


        if(head==null) {

            head=n;
            return;
        }


        Node curr=head;


        while(curr.next!=null)
            curr=curr.next;


        curr.next=n;
    }


    void deleteByValue(int data) {

        if(head==null)
            return;


        if(head.data==data) {

            head=head.next;
            return;
        }


        Node curr=head;


        while(curr.next!=null) {

            if(curr.next.data==data) {

                curr.next=curr.next.next;
                return;
            }

            curr=curr.next;
        }
    }


    void traverse() {

        Node curr=head;


        while(curr!=null) {

            System.out.print(curr.data);

            if(curr.next!=null)
                System.out.print(" -> ");

            curr=curr.next;
        }

        System.out.println(" -> null");
    }


    boolean search(int target) {

        Node curr=head;

        int index=0;


        while(curr!=null) {

            if(curr.data==target) {

                System.out.println(
                        "Found "+target+
                                " at index "+index);

                return true;
            }

            curr=curr.next;
            index++;
        }

        return false;
    }


    int length() {

        int count=0;

        Node curr=head;


        while(curr!=null) {

            count++;

            curr=curr.next;
        }

        return count;
    }


    public static void main(String[] args) {

        p8 list=new p8();


        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.insertAtHead(5);


        list.traverse();


        list.deleteByValue(20);


        list.traverse();


        list.search(30);


        System.out.println(
                list.length());
    }
}