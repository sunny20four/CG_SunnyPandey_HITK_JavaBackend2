class P9 {

    private static P9 instance;


    private P9(){

    }


    public static synchronized P9 getInstance(){

        if(instance==null)
            instance=new P9();

        return instance;
    }


    void display(){

        System.out.println("Singleton Object Created");
    }


    public static void main(String args[]){

        P9 obj1=P9.getInstance();
        P9 obj2=P9.getInstance();


        obj1.display();

        System.out.println(obj1==obj2);
    }
}