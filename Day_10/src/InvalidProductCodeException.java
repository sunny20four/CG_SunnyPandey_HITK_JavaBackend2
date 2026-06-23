public class InvalidProductCodeException extends RuntimeException {
    public InvalidProductCodeException(String code) {
        super("Invalid product code format: '" + code + "'. Expected: PRD-XXXX");
    }
}
