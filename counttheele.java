import java.util.*;
public class counttheele{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Number of elements in array: " + arr.length);
        
        sc.close();
    }
}