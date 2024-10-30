//count even string program
class Program10{
		public static void main(String[] args){

			String[] s = {"mohan ","Sohan","Rama","alok","Jack"};
		countEvenString(s);
		}

		//method declaration
		public static void countEvenString(String[] s){
		
			int count =0;
			for(int i =0;i<s.length;i++){
				if(s[i].length() %2 ==0){
						System.out.println(s[i].length());
						count= count+1;	
						}	
				
				}
		System.out.println("Total such elements"+count);
				
		}



}
