import java.util.Scanner;

public class Rec08_CountDigits {

    public static int countDigits(int n) {
        n = Math.abs(n); // Handle negative numbers
        if (n == 0) return 1; // Special case: 0 has one digit
        return countDigitsHelper(n);
    }

    private static int countDigitsHelper(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigitsHelper(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int n = scanner.nextInt();

        int result = countDigits(n);
        System.out.println("Number of digits: " + result);

        scanner.close();
    }
}
