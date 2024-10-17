public class Program32 {

    public static void main(String[] args) {
        int[] a ={12,25,40,56,70,80};
        System.out.println("the orginal array is :");
        for(int org:a){
            System.out.print(org+" ");
        }
        //method calling
        rotateArray(a);
        // method-2
        getRotateLeft(a);

    }
    //method decalrations
    public static void rotateArray(int[] a){
        int[] b = new int[a.length];
        for(int i =0; i < a.length;i++){
            
            if(i < a.length-1){
                b[i+1] =a[i];

            }
            else if(i == a.length-1){
                b[0] = a[a.length-1];
            }

        }
        System.out.println("\n the rotate array is ");

        for(int arr: b){
            System.out.print(arr+" ");
        }

    }
    // method-2
    public static void getRotateLeft(int[] a){
      
            int n = a.length-1;
    
            for(int i=n;i>=0;i--){
                int temp = a[i];
                a[i] = a[n];
                a[n] = temp;
            }
        

    }


    
}
