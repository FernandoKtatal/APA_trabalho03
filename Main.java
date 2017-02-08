import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
     	int op;
     	op = Integer.parseInt(args[0]);
   	
   	
   	    Scanner input = new Scanner(System.in);
		
		
   	    
		int n = input.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
	}
		



	switch(op){
 	case 1:

 		radixSort.radixsort(arr, arr.length);

        for (int k = 0; k<n; k++){
        	 System.out.println(arr[k]);
        	 }
 		
 		break;

       case 2:
    	   int maxnum = arr[0];
    	   for(int j = 1 ; j < arr.length;j++){
    		   if(arr[j]> maxnum)
    			   maxnum = arr[j];
    	   }
		BucketSort.sort(arr, maxnum);
           for (int k = 0; k<n; k++){
          	 System.out.println(arr[k]);
          	 }
        break;

       case 3:
    	   countingSort.sort(arr);
           for (int k = 0; k<n; k++){
          	 System.out.println(arr[k]);
          	 }
       	break;

   

    

       	
    }
	
	input.close();

} 

}
