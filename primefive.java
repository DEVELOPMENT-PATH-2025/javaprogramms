import java.util.*;
public class primefive {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();
     for(int i = 5; i<n; i++){
        if(n%i==0){
            System.out.println("Not Prime");
            break;
        }
     }
     sc.close();
    }
}
