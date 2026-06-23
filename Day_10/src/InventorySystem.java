public class InventorySystem {
    public static void validateCode(String code) {
        if (!code.matches("PRD-\\d{4}")) {
            throw new InvalidProductCodeException(code);
        }
        System.out.println("Valid code: " + code);
    }

    public static void main(String[] args) {
        validateCode("PRD-1234");
        // validateCode("ITEM-ABC"); // Throws InvalidProductCodeException
    }
}
