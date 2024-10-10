class Program18{

		public static void main(String[] args){
		
			int[] a = {10,20,10,20,12,14,15,15,18};
		//method calling
			printExcatlyOnce(a);
			
		
		}
		//method declaration
		public static void printExcatlyOnce(int[] a){
		int[] freq = new int[101];
		
		for(int i=0;i<a.length;i++){
				freq[a[i]]++;
				
			}
		for(int i = 0;i<freq.length;i++){
				if(freq[i]>0){
					System.out.print(i+" ");
					}
				
			}


		}
		
}