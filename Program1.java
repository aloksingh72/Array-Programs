import java.util.Scanner;

class Program1{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	//array creation
	int[] a = new int[size];
	
		for(int i =0;i<a.length;i++){
	System.out.println("Enter the array element"+(i+1)+":");
		a[i] = sc.nextInt();
		
	}
	
	evenElements(a);
	


}

	public static void evenElements(int[] a){
		for(int i =0;i<a.length;i++){
		
		if(a[i]%2 ==0){
			System.out.print(a[i]+" ");
			}
			
			}
		
		
				

		}
}