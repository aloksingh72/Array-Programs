public class Program31 {

    public static void main(String[] args) {
        int[] a = { 3, 6, 7, 9, 11, 15, 12, 19 };
        // method calling
        countAndPrintPrime(a);
    }

    public static void countAndPrintPrime(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (isPrime(a[i])) {
                count = count + 1;
                System.out.print(a[i] + " ");
            }

        }
        System.out.println("\ntotal no of prime numbers "+count);

    }

    // prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
