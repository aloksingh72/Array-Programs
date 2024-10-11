public class Program24 {
    
    public static void main(String[] args) {
        int[] a ={12,150,156,365,57,89,99};
         sumAndAvg(a);
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
