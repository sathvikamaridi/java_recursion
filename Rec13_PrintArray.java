import java.util.Scanner;

public class Rec13_PrintArray {

    public static void printArray(int[] arr, int index) {
        if (index == arr.length)
            return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Array elements: ");
        printArray(arr, 0);
        sc.close();
    }
}
