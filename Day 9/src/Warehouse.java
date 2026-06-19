class Item {

    String name;

    Item(String name){
        this.name=name;
    }
}

class FragileItem extends Item{

    FragileItem(String name){
        super(name);
    }

    void handle(){
        System.out.println("Handle carefully "+name);
    }
}

class HazardousItem extends Item{

    HazardousItem(String name){
        super(name);
    }

    void safety(){
        System.out.println("Safety protocol "+name);
    }
}

class RefrigeratedItem extends Item{

    int temp;

    RefrigeratedItem(String name,int temp){
        super(name);
        this.temp=temp;
    }

    void check(){
        System.out.println(name+" "+temp);
    }
}

public class Warehouse{

    static void process(Item i){

        if(i instanceof FragileItem){
            FragileItem f=(FragileItem)i;
            f.handle();
        }

        else if(i instanceof HazardousItem){
            HazardousItem h=(HazardousItem)i;
            h.safety();
        }

        else if(i instanceof RefrigeratedItem){
            RefrigeratedItem r=(RefrigeratedItem)i;
            r.check();
        }

        else{
            System.out.println("Normal Item");
        }
    }


    public static void main(String[] args){

        Item[] items={
                new FragileItem("Glass"),
                new HazardousItem("Chemical"),
                new RefrigeratedItem("Milk",4),
                new Item("Toy")
        };


        for(Item i:items){
            process(i);
        }
    }
}
