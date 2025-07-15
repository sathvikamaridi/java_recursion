import java.util.Scanner;

public class Rec03_1toN {

    public static void print1toN(int current, int n) {
        if (current > n)
            return;
        System.out.print(current + " ");
        print1toN(current + 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        print1toN(1, n);
        scanner.close();
    }
}
