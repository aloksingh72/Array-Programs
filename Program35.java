// import java.util.Scanner;
public class Program35 {
    public static void main(String[] args) {
         

       
        int[] a={1,2,3,4,5,6,7,8,9};
       System.out.println("Enter the org array");

       for(int i:a){
        System.out.print(i+" ");
       }

        //method calling
        rotateKPositionToLeft(a,2);
        System.out.println("\n the reverse array to left ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    //method declarations
    public static void rotateKPositionToLeft(int[] a,int k){
        int n = a.length;
        k = k % n; 
         
       

          // Reverse the first k elements
        reverse(a,0,k-1);


        // Reverse the remaining n-k elements
        reverse(a, k, n - 1);
         // Reverse the entire array
         reverse(a, 0, n - 1);

        
    }
    public static void reverse(int[] a, int start, int end) {
       while(start< end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;
       }


        
    }
    
}
