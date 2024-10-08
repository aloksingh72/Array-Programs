class Program8{

public static void main(String[] args){
	int[] a ={12,23,45,67,34,40};
		//boolean result = checkProductIsEven(a);
			boolean result=checkProductIsEven2(a);
		if(result){
			System.out.println("Product of all Elements is even");

	}	
else{
		System.out.println("It is not even");
	}
	

		}

	//method decalration
		public static boolean checkProductIsEven(int[] a){
			int prod =1;
				for(int i =0;i<a.length;i++){
					prod = prod* a[i];
				}
			if(prod%2 ==0){
							return true;	
					}
	return false;
		}



		//method-2
			public static boolean  checkProductIsEven2(int[] a){
				for(int x:a){
						if(x%2 ==0){
							return true;
						}
			}
		return false;			
		}
}