import java.util.Scanner;

public class Rec09_PrintEven {

    public static void printEven(int current, int n) {
        if (current > n)
            return;
        System.out.print(current + " ");
        printEven(current + 2, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("Even numbers from 2 to " + n + ":");
        if (n >= 2) {
            printEven(2, n);
        } else {
            System.out.println("No even numbers in this range.");
        }

        scanner.close();
    }
}
