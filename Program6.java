class Program6{
	public static void main(String[] args){

	int[] a ={10,12,56,78,13,98,74};
		int diff = getDifference(a);
		System.out.println("the difference is :"+diff);

		
		}
	//mehtod declaration
	public static int getDifference(int[] a){
		
		int biggest = a[0];
		int smallest = a[0];
		for(int i =0;i<a.length;i++){
			if(a[i]>biggest){
					biggest = a[i];
						}
			if(a[i]<smallest){
				smallest = a[i];
				}

			}
		return biggest-smallest;
		
		}

}