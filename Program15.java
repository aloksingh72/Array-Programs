//most important
class Program15{
	public static void main(String[] args){

		int[] a ={12,15,12,18,20,12,15,12};
		
		//method calling
		printfreq(a);

	} 

	public static void printfreq(int[] a){
		int[] freq = new int[101];
	
		for(int i =0;i<a.length;i++){
			freq[a[i]]++;
			
			}

		for(int i=0;i<freq.length;i++){
				if(freq[i] >0){
						System.out.println(i+" is "+freq[i]+" times.");
					}

			}
		

		}




}