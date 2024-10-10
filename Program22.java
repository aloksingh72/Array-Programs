class Program22{

	public static void main(String[] args){

	int[] a = {10,10,12,15,10,5,48,49,46};
		
			//method calling	
		firstnonrepeating(a);
		
		
		}
	
	public static void  firstnonrepeating(int[] a){
			int[] freq = new int[101];

			
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		
		for(int i =0;i<a.length;i++){
				if(freq[a[i]] ==1){
						System.out.println(a[i]);
					}


				}


		}

}