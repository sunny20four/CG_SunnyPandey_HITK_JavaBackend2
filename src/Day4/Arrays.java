package Day4;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.print("Reverse: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("Duplicates: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
    }
}
