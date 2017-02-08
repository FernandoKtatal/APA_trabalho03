
public class countingSort {

    public static void sort( int[] arr ){
        int n = arr.length;
        int max = arr[0], min = arr[0];
        int j = 0;
        
        
        for (int i = 1; i < n; i++){
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];

        }

        int range = max - min + 1;

        int[] count = new int[range];


        for (int i = 0; i < n; i++)
            count[arr[i] - min]++;


        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];




        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;     
	 
	 }

}