import java .util.Scanner;
public class linearproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of the Array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Elements:");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target){
                System.out.println("The Index of the Target is " + i);
            }
            else{
                System.out.println("The Target is not found in the Array");
            }
        }
        sc.close();
    }
     
}
