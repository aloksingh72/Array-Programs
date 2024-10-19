/*
 * Dated ->  18/10/2024
 * very important-> find smallest and second smallest 
 */


 public class Program40 {

    public static void main(String[] args){
        int[] a = {17,17,15,14,10,16,17};
        //method calling
        getSmallestAndSecondSmallest(a);

    }
    public static void getSmallestAndSecondSmallest(int[] a){
        int smallest =a[0];
        int sec_smallest = Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i] <smallest){
                sec_smallest = smallest;
                smallest = a[i];
            }
            else if (a[i] < sec_smallest && a[i] != smallest){
                sec_smallest = a[i];
            }
        }
        System.out.println("smallest is "+smallest);
        System.out.println("second smallest is "+sec_smallest);


    }
    
}

