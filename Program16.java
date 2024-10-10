class Program16{
		public static void main(String[] args){
		int[] a ={12,15,12,14,15,15,};

		//method calling
		getFreqOne(a);
			
		}

	public static void getFreqOne(int[] a){

		int[] freq = new int[101];

			for(int i =0;i<a.length;i++){
				freq[a[i]]++;


			}

			for(int i=0;i<freq.length;i++){
						if(freq[i] ==1){
								System.out.println("element appear only once "+i);
							}
					}
		
		}



}