import java.util.*;

public class p9 {
    public static void main(String[] args) {

        HashMap<String,String> phone=new HashMap<>();

        phone.put("Ravi","9876543210");
        phone.put("Priya","9123456789");
        phone.put("Amar","9988776655");

        String name="Priya";

        if(phone.containsKey(name))
            System.out.println(phone.get(name));

        phone.put("Ravi","9000000000");

        for(Map.Entry<String,String> e:phone.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}