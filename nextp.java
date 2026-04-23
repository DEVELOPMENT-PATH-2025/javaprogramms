public class nextp {
    public static void main(String[] args) {
        int n = 60;
        System.out.print("Prime factors of " + n + " are: ");
        primeFactors(n);
    }
    
    static void primeFactors(int n) {
        boolean[] isPrime = new boolean[n + 1];
        
      
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Print prime factors
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] && n % i == 0) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x *= i;
                }
            }
        }
    }
}
