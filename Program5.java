

class Program5{
	public static void main(String[] args){
		int[] a ={12,24,56,89,78};
		
		//method calling
		int biggest = getBiggest(a);
	System.out.println("the Biggest is "+biggest);
		
	
		
		
			}
	//method decalration
	public static int getBiggest(int[] a){
	int biggest =a[0];
		for(int i=0;i<a.length;i++){
			
			if(a[i]>biggest){
				biggest = a[i];
					}
			}
		return biggest;
	
		}

}