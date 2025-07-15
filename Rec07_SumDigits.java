import java.util.Scanner;

public class Rec07_SumDigits {

    public static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int n = scanner.nextInt();

        n = Math.abs(n); // Ensure it works for negative numbers too
        int result = sumDigits(n);
        System.out.println("Sum of digits: " + result);

        scanner.close();
    }
}
