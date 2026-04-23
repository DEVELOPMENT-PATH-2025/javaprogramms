import java.util.Arrays;
import java.util.Scanner;
public class RotateArrayLeft {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate left (K): ");
        int k = sc.nextInt();
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        rotateLeft(arr, k);
        System.out.println("Array after left rotation by " + k + " positions: " + Arrays.toString(arr));
        sc.close();
    }
}