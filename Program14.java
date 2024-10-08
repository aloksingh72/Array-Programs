class Program14{

		public static void main(String[] args){
			int[] a ={12,18,30,56,45,90};
				for(int x:a){
						System.out.print(x+" ");
					}
				System.out.println(" ");
			int[] b =  insertElements(a,3,100);
			for(int i:b){
							System.out.print(i+" ");
					}
			
				
			}
			//method declaration
			public static int[] insertElements(int[] a,int index,int value){
					int[] b = new int[a.length+1];
					for(int i =0;i<b.length;i++){
				if(i<index){
						b[i] =a[i];
							}
				else if (i==index){
							b[i] =value;
							}
				else{
						b[i] = a[i-1];
					}
					
					}
				return b;
					
			}

}