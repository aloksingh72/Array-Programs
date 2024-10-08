class Program9{
		public static void main(String[] args){
	String[] a ={"Mohan","Ram","tom and Jerry"};
		
		//stringSize(a);
		stringSize2(a);
		
	
	}
		//method decalration
		public static void stringSize(String[] s){
		for(int i = 0;i<s.length;i++){
			System.out.println(s[i].length());
		}
			
		}
		//method-2
	public static void stringSize2(String[] s){
		for(String p : s){
					System.out.println(p.length());
				}
		}



}