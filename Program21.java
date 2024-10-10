class Program21{

		public static void main(String[] args){
		
			int[] a ={10,12,12,12,72,72,72,72}; 
		//method calling
		getMaxTimeElement(a);
		
			
		}

		public static void getMaxTimeElement(int[] a){
		int[] freq = new int[101];

			for(int i=0;i<a.length;i++){
					freq[a[i]]++;

					}

			int max =0;
			int element = a[0];
		for(int i = 0;i<freq.length;i++){

						if(freq[i]> max){
							max = freq[i];
							element = i;
							
							}
					}
			System.out.println(element +" appear max time i.e "+max+" times");
			
			}
		
}