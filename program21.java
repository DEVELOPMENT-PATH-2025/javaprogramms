import java.util.*;
public class program21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
        System.out.println("The maximum index is " + maxIndex + " and the minimum index is " + minIndex);
        sc.close();
    }  
}
