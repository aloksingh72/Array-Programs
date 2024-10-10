class Program17{

public static void main(String[] args){

			int[] a = {10,10,15,3,23,15,15,16,16,16};
			//method calling
			System.out.println("these elements appears only once");
			appearOnlyOnce(a);
			

		}
			//method declaration
		public static void appearOnlyOnce(int[] a){
			int[] freq = new int[101];
		for(int i=0;i<a.length;i++){
			
					int x= a[i];
					freq[x]++;
					//freq[a[i]]++;
			}
		for(int i=0;i<freq.length;i++){
			
				
				if(freq[i]>1){
						
						System.out.print(i+" ");
						
						
					}
			}

		}
}