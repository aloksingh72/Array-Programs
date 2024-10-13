public class Program27 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 9 };
        System.out.println("the original array is :");
        for (int arr : a) {
            System.out.print(arr + " ");

        }

        // method -1
        //getReverse(a);
        //method -2 effecient method
        int n = a.length-1;
        System.out.println("\n the reverse array is ");
        getReverse2(a,0,n);

    }

    // method declarations
    public static void getReverse(int[] a) {

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];

        }
        System.out.println("\n the reverse array is ");
        for (int rev : b) {
            System.out.print(rev + " ");
        }

    }

    // method -2 effecient method beccause it does not need another new array
    public static void getReverse2(int[] a,int start,int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }

}

/*
For taking array element input from the user
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of the array");
 * int size = sc.nextInt();
 * 
 * int [] a = new int[size];
 * for(int i =0;i<a.length;i++){
 * System.out.println("Enter the array element"+(i+1)+":");
 * a[i] = sc.nextInt();
 * }
 */
