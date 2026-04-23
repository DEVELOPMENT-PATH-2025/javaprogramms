import java.util.Scanner;

public class smallestprimefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
            return;
        }
        
        int[] spf = smallestPrimeFactors(n);
        
        System.out.println("\nSmallest Prime Factors up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            System.out.print("SPF[" + i + "] = " + spf[i] + "\t");
        }
        
        scanner.close();
    }
    
    public static int[] smallestPrimeFactors(int n) {
        int[] spf = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            spf[i] = i;
        }
        
        
        for (int i = 4; i <= n; i += 2) {
            spf[i] = 2;
        }
        
        for (int i = 3; i * i <= n; i++) {
            if (spf[i] == i) {
    
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        
        return spf;
    }
}
