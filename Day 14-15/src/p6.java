public class p6 {
    public static void main(String[] args) {

        try {
            String s=null;
            System.out.println(s.length());

            int a=10/0;

        }
        catch(Exception e) {
            System.out.println("Exception handled");
        }
    }
}