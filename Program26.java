public class Program26 {
    public static void main(String[] args) {
        String[] s = {"alok","rohan","tom and jerry","Iron man","captain America"};
        getbiggestSmallest(s);
    }

    public static void getbiggestSmallest(String[] a){
        String big = a[0];
        String small = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i].length() > big.length()){
                big = a[i];

            }
            if(a[i].length() < small.length()){
                small = a[i];
            }
        }
        System.out.println("the biggest string is \n"+big+" \n and the smallest string is \n"+small);

    }
    
}

/*
For taking String array element input from the user
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of the array");
 * String size = sc.nextInt();
 * sc.nextLine();
 * String [] a = new String[size];
 * for(int i =0;i<a.length;i++){
 * System.out.println("Enter the array element"+(i+1)+":");
 * a[i] = sc.nextLine();
 * }
 */
