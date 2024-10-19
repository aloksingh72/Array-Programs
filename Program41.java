public class Program41 {
    public static void main(String[] args) {
        int[] a={12,18,0,0,17,0,15};
        // method calling 
        moveZeroes(a);
        for(int p:a){
            System.out.print(p+" ");
        }
    }
    public static void moveZeroes(int[] a){
        for(int i=0,j=0;i<a.length;i++){
        if(a[i] !=0){
            a[j] = a[i];
                if(i != j){
                    a[i] =0;
                }
                j++;
            }
        }
    }
    
}
