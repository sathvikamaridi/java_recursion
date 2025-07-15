import java.util.Scanner;

public class Rec02_Nto1 {

    public static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Numbers from " + n + " to 1:");
        printNto1(n);
        scanner.close();
    }
}
