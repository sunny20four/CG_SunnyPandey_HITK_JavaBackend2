public class p3 {

    static void process(int amount) {
        try {
            if(amount<=0)
                throw new IllegalArgumentException("Invalid amount");

            System.out.println("Payment done "+amount);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction closed");
        }
    }

    public static void main(String[] args) {
        process(500);
        process(-100);
    }
}