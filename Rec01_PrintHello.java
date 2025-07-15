import java.util.Scanner;

public class Rec01_PrintHello {

    public static void printHello(int n) {
        if (n == 0)
            return;
        System.out.println("Hello my dear");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print: ");
        int n = scanner.nextInt();
        printHello(n);
        scanner.close();
    }
}
