public class anotherapproach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
        System.out.println("The maximum index is " + maxIndex + " and the minimum index is " + minIndex);
    }
}
