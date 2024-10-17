// import java.util.Scanner;

public class Program33a {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        /*
         * For taking array element input from the user
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter the size");
         * int size = sc.nextInt();
         * int[] arr = new int[size];
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println("enter the first element " + (i + 1) + ":");
         * arr[i] = sc.nextInt();
         * 
         * }
         */

        // method calling
        rotateKPositionToRight(a, 2);
        for (int i : a) {
            System.out.print(i + " ");
        }
        // sc.close();
    }

    public static void rotateKPositionToRight(int[] a, int k) {
       
        // Normalize 'k' if it's greater than the length of the array
        
        // Step 1: Reverse the entire array
        // reverse(a, 0, n - 1);
        int n = a.length;
        for(int i=0;i<n;i++){
                a[i+1] =a[i];


        }

        // Step 2: Reverse the first 'k' elements
        // reverse(a, 0, k - 1);

        // Step 3: Reverse the remaining 'n - k' elements
        // reverse(a, k, n - 1);
        k = k % n;
        




    }
/* 

    public static void reverse(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }
    }
        */
    // alternative way
    /*
     * public static void reverse(int[] a, int start, int end) {
     * for (int i = start; i < end; i++, end--) {
     * int temp = a[i];
     * a[i] = a[end];
     * a[end] = temp;
     * }
     * }
     */

}

