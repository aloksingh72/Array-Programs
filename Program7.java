class Program7{
		public static void main(String[] args){
	int[] a = {12,34,56,40,10,50};
		boolean result = checkEven(a);
		if(result){
	System.out.println("It is Even");

	}
else{
	System.out.println("It is not Even");
	}
	
	
	
	}

	//method decalration
	
	public static boolean checkEven(int[] a){
	
	for(int i =0;i<a.length;i++){
		if(a[i] %2 == 1  ){
					return false;
			}
		}
		return true;	
	}	
}