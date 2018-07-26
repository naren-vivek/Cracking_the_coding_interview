package Chapter1;

public class Find {

	int findElement(int arr[], int n)
	{
	    // leftMax[i] stores maximum of arr[0..i-1]
	    int[] leftMax=new int[n] ;
	    leftMax[0] = Integer.MIN_VALUE;
	 
	    // Fill leftMax[]1..n-1]
	    for (int i = 1; i < n; i++){
	    	  leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
	    	  System.out.println("leftMax for "+i+" "+leftMax[i]);
	    }
	      
	 
	    // Initialize minimum from right
	    int rightMin = Integer.MAX_VALUE;
	 
	    // Traverse array from right
	    for (int i=n-1; i>=0; i--)
	    {
	        // Check if we found a required element
	        if (leftMax[i] < arr[i] && rightMin > arr[i])
	             return i;
	 
	        // Update right minimum
	        rightMin = Math.min(rightMin, arr[i]);
	    }
	 
	    // If there was no element matching criteria
	    return -1;
	}
	
	
	public static void main(String[] args) {
		 int arr[] = {4,7,2,8,9,10};
		    int n = arr.length;
		    Find f = new Find();
		    System.out.println(f.findElement(arr, n));
	}
}
