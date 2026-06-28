public class p7 {

    int data[];
    int front;
    int rear;
    int size;
    int capacity;


    p7(int capacity) {

        this.capacity=capacity;

        data=new int[capacity];

        front=0;
        rear=0;
        size=0;
    }


    boolean enqueue(int val) {

        if(size==capacity) {

            System.out.println(
                    "Queue full!");

            return false;
        }


        data[rear]=val;

        rear=(rear+1)%capacity;

        size++;

        return true;
    }


    int dequeue() {

        if(size==0)
            return -1;


        int val=data[front];

        front=(front+1)%capacity;

        size--;

        return val;
    }


    public static void main(String[] args) {

        p7 cq=new p7(3);


        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);

        cq.enqueue(4);


        System.out.println(
                cq.dequeue());


        cq.enqueue(4);


        System.out.println(
                cq.dequeue());
    }
}