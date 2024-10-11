public class Program25 {
    public static void main(String[] args) {
        String[] s = {"mohan","Sohan","alok","ashutosh"};
        //method calling
        getEvenString(s);
    }
    //method declaration
    public static void getEvenString(String[] a){
        int count =0;
        for(int i =0;i<a.length;i++){
            if(a[i].length() % 2 ==0){
                System.out.println(a[i]);
                count = count+1;
            }

        }
        System.out.println("the no of even string are"+count);

    }
}
