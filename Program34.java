public class Program34 {
 
    
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9};
        //method calling
        rotateLeft(a);
        for(int i:a){
            System.out.print(i+" ");
        }

    }

   
    public static void rotateLeft(int[] a){
            //store the first element
        int firstElement = a[0];
        
        for(int i =1;i<a.length;i++){
            a[i-1] = a[i];

        }
        a[a.length-1] = firstElement;


    }
}
