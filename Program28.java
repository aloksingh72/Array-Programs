public class Program28 {

    public static void main(String[] args) {
   int[] a ={1,2,3,4,5,6,7,9};
//    the orginal array
for(int p:a){
    System.out.print(p+" ");
}
System.out.println();
        //method calling 

    // printAltArray(a);
    // print alternate array from end
    printAltRevArray(a);
    for(int x:a){
        System.out.print(x+" ");
    }
    
    
    }
//print alternate array
    public static void printAltArray(int[] a){
        int n = a.length;
        for(int i =0;i<n;i+=2){
            System.out.print(a[i]+" ");

        }

    }
    // print alternate array from end
    public static void printAltRevArray(int[] a){
        int n= a.length;
        for(int i=n-1,j=0;i>=0;i-=2,j++){
            a[j] = a[i];

        }

    }

    
}
