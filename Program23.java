/**
 * Program23
 */
public class Program23 {

    public static void main(String[] args) {
        
        int[] a ={12,150,156,365,57,89,99};
        countThreeDigit(a);
       
    }

    //method declaration
    public static void countThreeDigit(int[] a){
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i] >100 && a[i]<999){
                System.out.print(a[i]+" ");
                count = count+1;;
            }
        }
        System.out.println("\n no.of three digit is: "+count);
    }

    
}
