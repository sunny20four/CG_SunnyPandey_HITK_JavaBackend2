class InvalidProductCodeException extends RuntimeException {

    public InvalidProductCodeException(String code) {

        super("Invalid product code: "+code);
    }
}


public class p11 {


    static void validateCode(String code) {

        if(!code.matches("PRD-\\d{4}")) {

            throw new InvalidProductCodeException(code);
        }

        System.out.println("Valid code");
    }


    public static void main(String[] args) {

        validateCode("PRD-1234");

        validateCode("ITEM-123");
    }
}