import java.util.Scanner;
public class Rec10_ReverseNumber {

    public static void reverse(int n) {
        if (n == 0)
            return;
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("0");
        } else {
            System.out.print("Reversed number: ");
            reverse(Math.abs(n)); // Support negative values
        }
        sc.close();
    }
}
