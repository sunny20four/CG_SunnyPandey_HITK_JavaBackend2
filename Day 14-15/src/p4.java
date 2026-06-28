public class p4 {

    static void check(String id) {
        try {
            if(id==null)
                throw new NullPointerException();

            int x=Integer.parseInt(id);

            if(x<0)
                throw new IllegalArgumentException();

            System.out.println(x);
        }
        catch(NullPointerException e) {
            System.out.println("Null id");
        }
        catch(NumberFormatException e) {
            System.out.println("Wrong format");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Negative id");
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void main(String[] args) {
        check("P102");
        check(null);
        check("-5");
    }
}
