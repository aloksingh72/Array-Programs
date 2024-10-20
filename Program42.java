public  class Program42{
    public static void main(String[] args) {
        int[] a ={0,1,0,2,2,1,2,0};
        
		for(int x:a){
		System.out.print(x+" ");
	}
    System.out.println();
	//method calling
			shift012(a);
		for(int p:a){

		System.out.print(p+" ");
		}

        
    }
    public static void shift012(int[] a){
	
		int count0=0;
		int count1 =0;
		for(int i =0; i<a.length;i++){

			if(a[i] == 0){

				count0++;
				}
			else if(a[i] ==1){
				
					count1++;
					}

			}
	for(int i =0 ;i<a.length;i++){
	
			if(i< count0){

			a[i] =0;
			}
	else if (i< count0 +count1){
      a[i] =1;
   
		}
	else {
			a[i] =2;
			}
		}
        
    }
}