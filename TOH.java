public class TOH {
    static void towerofhanoi(int n, char fromrod, char torod, char auxrod){
        if(n==0){
            return;

        }
        towerofhanoi(n - 1, fromrod, auxrod, torod);
        System.out.println("Disk " + n + " moved from "
                + fromrod + " to "
                + torod);
        towerofhanoi(n - 1, auxrod, torod, fromrod);
    }

    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n-1,'A','C','B');
    }
}
