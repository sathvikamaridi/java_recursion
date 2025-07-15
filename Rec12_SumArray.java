import java.util.Scanner;

public class Rec12_SumArray {

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int sum = sumArray(arr, 0);
        System.out.println("Sum of array = " + sum);
        sc.close();
    }
}
