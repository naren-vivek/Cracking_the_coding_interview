package Chapter1;

class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
    	for(int i=0;i<size;i++){
    		if(arr[i]>=0){
    			arr[arr[i]]= -(Math.abs(arr[i])+i) ;
    		}
    		else if(arr[<Math.abs(arr[i])]%i){
    		}
    	}
    } 
 
    // Driver program 
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {1, 6, 3, 1, 3, 6, 6};
        int arr_size = arr.length;
 
        duplicate.printRepeating(arr, arr_size);
    }
}
 