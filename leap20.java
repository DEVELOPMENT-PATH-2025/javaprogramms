//Write a program that prints the next 20 leap years.
public class leap20 {
    public static void main(String[] args) {
        int currentYear = 2024;
        int count = 0;
        
        System.out.println("Next 20 leap years:");
        
        while (count < 20) {
            if (isLeapYear(currentYear)) {
                System.out.print(currentYear + " ");
                count++;
            }
            currentYear++;
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
