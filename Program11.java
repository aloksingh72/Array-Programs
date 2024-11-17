// program 11-> print biggest string 
class Program11{
	public static void main(String[] args){

			String[] s = {"Mohan","Rohan","tom and Jerry","tiger"};
		//String result = printBiggestString(s);
			String result = printBiggestString2(s);
		
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

			//method-2
	         // print biggest string
		public static String printBiggestString2(String[] a){
		String biggest = " ";
		for(String p:a){
			if(p.length() >biggest.length()){
						biggest = p;
						} 
				}
		return biggest;
		}

}
