import java.util.Scanner;

public class Rec06_SumNatural {

    public static int sumOfNatural(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N to find the sum of first N natural numbers: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Natural numbers cannot be negative.");
        } else {
            int result = sumOfNatural(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }

        scanner.close();
    }
}
