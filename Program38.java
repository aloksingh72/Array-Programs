public class Program38
{

    public static void main(String[] args) {
        int[] a = {7,8,9,6,5,3};
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        //method calling
        getReverse(a);
        for(int p:a){
            System.out.print(p+" ");
        }
    }
    public static void getReverse(int[] a){
        int end = a.length-1;

        for(int start=0;start<=end;start++,end--){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
        }
    }

    
}
