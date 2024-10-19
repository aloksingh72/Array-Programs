/*
 * Dated ->  18/10/2024
 * very important-> find biggest and second biggest
 */


public class Program39 {

    public static void main(String[] args){
        int[] a = {17,17,15,14,10,16,17};
        //method calling
        getBiggestAndSecondBiggest(a);

    }
    public static void getBiggestAndSecondBiggest(int[] a){
        int biggest =a[0];
        int sec_biggest = Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i] >biggest){
                sec_biggest = biggest;
                biggest = a[i];
            }
            else if (a[i] > sec_biggest && a[i] != biggest){
                sec_biggest = a[i];
            }
        }
        System.out.println("biggest is "+biggest);
        System.out.println("second biggest is "+sec_biggest);


    }
    
}
