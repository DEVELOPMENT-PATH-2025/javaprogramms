public class maxminele {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 9, 2, 4, 6 };
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
