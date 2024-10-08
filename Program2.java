import java.util.Scanner;

class Program2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	
	int size = sc.nextInt();
	 int[] a = new int[size];
	for (int i=0;i<a.length;i++){
		System.out.println("Enter the array elements"+(i+1)+":");
		a[i]=sc.nextInt();
		}
	
		
	evenIndex(a);

	}

//method declaration
	public static void evenIndex(int[] a){
	for(int i=0;i<a.length;i++){
	
	if(i%2 ==0){
	System.out.print(a[i]+" ");
	
			}	
	
		}
	
	
	}	


}