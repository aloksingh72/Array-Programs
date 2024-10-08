class Program13{

		public static  void main(String[] args){
			int[] a ={12,18,56,14,20};
		int[] b = removeElement(a,3);
		for(int x :a){
			System.out.print(x+" ");
			

		}

			

		System.out.println("\nthe updated array is :");
		
				
			
			for (int i : b) {
            System.out.print(i + " ");
        }
		}


			//method declaration
		public static int[] removeElement(int[] a,int index){

				if (index < 0 || index >= a.length) {
            throw new IllegalArgumentException("Invalid index");
        }				

				int[] b = new int[a.length-1];
				for(int i =0;i<a.length-1;i++){
					if(i<index){
								b[i] =a[i];
							
						}
					else{
							b[i]  = a[i+1];
					}
				}
				return b;
					
			}


}