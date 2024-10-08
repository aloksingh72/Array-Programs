import java.util.Scanner;
class Program12
{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of aray");
		int size = sc.nextInt();
		//sc.nextLine();
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++){
		
			System.out.println("Enter the Integer"+(i+1)+":");
			arr[i] = sc.nextInt();
		}

		if(isStrictlyIncreasing(arr)){
		System.out.println("Array is Strictly increasing");
			}
		else{
		System.out.println("Array is not Strictly increasing");
		}
	

}
//method decalration
	public static boolean isStrictlyIncreasing(int[] a)
	{
		for(int i=0;i<a.length-1;i++){
			 if (a[i + 1]<= a[i]){
				return false;
				}

		}
	return true;
	}

}