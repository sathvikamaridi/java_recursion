import java.util.Scanner;

public class Rec15_PalindromeCheck {

    public static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }
}
