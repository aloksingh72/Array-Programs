public class Program29 {

    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        swapValues(a,1,2);
    }
    public static void swapValues(int[] a,int x ,int y){
        int temp ;
        //using third varibale temp
        for(int i=0;i<a.length;i++){
            temp = a[x];
            a[x] = a[y];
            a[y] = temp;
        }
        for (int arr : a) {
            System.out.print(arr+" ");
            
        }



    }
    
}
