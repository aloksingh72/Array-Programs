public class Program27 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 9 };
        System.out.println("the original array is :");
        for (int arr : a) {
            System.out.print(arr + " ");

        }

        getReverse(a);
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

}
