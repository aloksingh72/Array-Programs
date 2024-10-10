/**
 * Program23
 */
public class Program23 {

    public static void main(String[] args) {
        
        int[] a ={12,150,156,365,57,89,99};
        countThreeDigit(a);
        // sumAndAvg(a);
    }

    //method declaration
    public static void countThreeDigit(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] >100 && a[i]<999){
                System.out.print(a[i]+" ");
            }
        }
    }

     //method declaration
     public static void sumAndAvg(int[] a){
        // int res =0;
        int sum =0;
        for (int i : a) {
            // System.out.print(i+" ");
            sum = sum +i;
        }
        System.out.println("sum is "+sum);
        int res = sum /a.length;
        System.out.println("Avg is "+res);

    }
}
