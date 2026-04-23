public class match {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 2, 3, 4};
        int[] arr3 = {1,2,3,4,8};
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                for(int k = 0; k < arr3.length; k++) {
                    if(arr1[i] != arr2[j] && arr2[j] != arr3[k]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                    
                }
            }
        }
    }
}
