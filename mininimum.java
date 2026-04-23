public class mininimum {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        
        System.out.println("The three numbers are: " + a + ", " + b + ", " + c);
        
        int minimum = findMinimumWithoutComparison(a, b, c);
        System.out.println("Minimum of the three numbers: " + minimum);
    }
    
    // Find minimum of three integers without using comparison operators
    public static int findMinimumWithoutComparison(int a, int b, int c) {
        // Using bit manipulation technique
        
        // Step 1: Find minimum of a and b
        int minAB = minWithoutComparison(a, b);
        
        // Step 2: Find minimum of result and c
        int minABC = minWithoutComparison(minAB, c);
        
        return minABC;
    }
    
    // Helper method to find minimum of two integers without comparison
    public static int minWithoutComparison(int x, int y) {
        // Calculate difference
        int diff = x - y;
        
        // Extract the sign bit (1 if negative, 0 if positive)
        // Right shift by 31 positions to get sign bit in rightmost position
        // For negative numbers, arithmetic right shift fills with 1s
        int sign = (diff >> 31) & 1;
        
        // If diff >= 0 (x >= y), sign = 0, so we return y
        // If diff < 0 (x < y), sign = 1, so we return x
        return y + (sign * (x - y));
    }
}