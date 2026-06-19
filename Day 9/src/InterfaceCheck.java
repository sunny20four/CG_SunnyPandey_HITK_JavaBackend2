interface Serializable{

    void serialize();
}

interface Loggable{

    void log();
}


class User implements Serializable,Loggable{


    public void serialize(){
        System.out.println("Serialized");
    }


    public void log(){
        System.out.println("Logged");
    }
}



public class InterfaceCheck{

    public static void main(String[] args){

        Object[] obj={
                new User(),
                "Hello"
        };


        for(Object o:obj){

            if(o instanceof Serializable){

                Serializable s=(Serializable)o;

                s.serialize();
            }


            if(o instanceof Loggable){

                Loggable l=(Loggable)o;

                l.log();
            }
        }
    }
}