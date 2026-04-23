import java.util.Scanner;
public class patternprinting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number of rows");
        a = sc.nextInt();
        for(int i = 1 ; i<= a; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();

    }
}