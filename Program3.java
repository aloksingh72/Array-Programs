import java.util.Scanner;

class Program3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();	
	
	//array creation

	int[] a = new int[size];
	for(int i=0;i<a.length;i++){
		System.out.println("Enter the array elements"+(i+1)+":");
			a[i] = sc.nextInt();
			}
	//method calling
		sumOfElements(a);
	
	}


	//method declaration
		public static void sumOfElements(int[] a){
		int sum =0;
			for(int i=0;i<a.length;i++){
			sum = sum +a[i];
			
			}
			System.out.println("the sum of array elements is "+sum);
		
		
		}
}