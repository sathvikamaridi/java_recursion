import java.util.Scanner;

public class Rec11_ProductN {

    public static long product(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to find product of first N natural numbers: ");
        int n = sc.nextInt();
        long result = product(n);
        System.out.println("Product = " + result);
        sc.close();
    }
}
