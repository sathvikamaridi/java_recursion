import java.util.Scanner;

public class Rec04_Factorial {

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        scanner.close();
    }
}
