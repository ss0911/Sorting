
public class NewSort {
	static void newsort(int[] arr) {  
        int n = arr.length;  
        int x = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 x = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = x;  
                         }  
                          
                 }  
         }  
  
    }  
	public static void main(String[] args) {
		int arr[] ={3,60,35,2,45,320,5};  
        
        System.out.println("Array Before Sorting: ");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        newsort(arr);
         
        System.out.println("Array After Sorting:");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  


	}

}
