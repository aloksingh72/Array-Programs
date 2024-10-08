import java.util.Scanner;
class Program4{

		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		//Array creation
		int[] a = new int[size];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter the array elements"+(i+1)+":");
				a[i] = sc.nextInt();
				
			
			}
		//method calling
		boolean result = sumDivBy4(a);

		if(result){
			System.out.println("The array sum  is divisible 4");
			}
		else{
			System.out.println("The array is not divisible by 4");
			}

			
	}

		public static boolean sumDivBy4(int[] a){
		

			int sum =0;
		for(int i =0;i<a.length;i++){
			
			
			sum = sum+a[i];
				
			}
		System.out.println("sum is:"+sum);
		
		return sum%4 ==0;
		

		}


}