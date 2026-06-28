public class p9 {

    public static void validateAge(int age) {

        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }

        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        validateAge(20);
        validateAge(-5);
    }
}