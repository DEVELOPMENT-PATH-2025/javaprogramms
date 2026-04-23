import java.util.*;
public class Divisior {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            for(int i = 1; i> n; i--){
                if(n % i == 0){
                    System.out.printf(" %d ", i);
                    if(n/i != i){
                        System.out.printf("\n \t%d ", i);
                    }
                }
            }
        }       
        sc.close();
    }
}
