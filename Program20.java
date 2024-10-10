class Program20{

	public static void main(String[] args){

		int[] a= {12,60,12,60,60,15,15,18,15,98,15};
		//method calling
			getOddTimes(a);
					

		}

		public static void getOddTimes(int[] a){
				int[] freq = new int[101];
			
			for(int i =0;i<a.length;i++){
					
				freq[a[i]]++;
							
				}
		for(int i =0;i<freq.length;i++){
					if(freq[i]>0 && freq[i] %2 ==1 ){
						System.out.print(i+" ");

						
					}		
				}

			}


}