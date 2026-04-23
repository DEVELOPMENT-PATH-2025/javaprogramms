import java.util.*;
public class huio {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three positive integers:");
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int min = 0;
        while(n > 0 && a > 0 && b > 0){
            n--;
            a--;
            b--;
            min++;
        }
        System.out.println("The minimum of the three numbers is: " + min);
        sc.close();
    }
}
