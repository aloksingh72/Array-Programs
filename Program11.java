class Program11{
	public static void main(String[] args){

			String[] s = {"Mohan","Rohan","tom and Jerry","tiger"};
		String result = printBiggestString(s);
		
			System.out.println(result);
			
		}
	//method declaration
		public static String printBiggestString(String[] a){
			String biggest = " ";
		for(int i=0;i<a.length;i++){
			if(a[i].length() > biggest.length()){
						biggest = a[i];
						}
				}
		return biggest;
		}

}