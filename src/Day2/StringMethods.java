package Day2;

public class StringMethods {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        String trimmed = text.trim();

        System.out.println("Length: " + text.length());
        System.out.println("Character: " + trimmed.charAt(2));
        System.out.println("Substring: " + trimmed.substring(0, 4));
        System.out.println("Trim: " + trimmed);
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Replace: " + trimmed.replace("Java", "Core Java"));
        System.out.println("Contains: " + trimmed.contains("Program"));
        System.out.println("Starts With: " + trimmed.startsWith("Java"));
        System.out.println("Ends With: " + trimmed.endsWith("ing"));
        System.out.println("Equals: " + trimmed.equals("Java Programming"));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase("java programming"));
    }
}
