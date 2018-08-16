package Helper;

public class SaveWaterMyWay {
	
	public static Integer countSaveWater(int [] arr){
		
		int low=0;
		int high=0;
		for(int i=1; i<arr.length;i++){
			if(arr[i]> arr[i-1] && arr[i] > arr[i+1]){
				low=i;
				break;
			}else{
				continue;
			}
			
		}
		System.out.println(low);
		
		for(int i=arr.length-2; i>=0;i--){
			if(arr[i]> arr[i+1] && arr[i] > arr[i-1]){
				high=i;
				break;
			}else{
				continue;
			}
			
		}
		System.out.println(high);
		int newLow=low;
		int sum=0;
		for(int i=low+1;i<=high;i++){
			if(arr[i]>= arr[i-1] && arr[i]> arr[i+1]){
				sum+=arr[newLow];
				newLow=arr[i];
			}
			else if(arr[i]>= arr[newLow]){
				sum+=arr[newLow]-arr[i];
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[]{
				0,1,0,2,1,0,1,3,2,1,2,1	
		};
		System.out.println(countSaveWater(arr));
	}

}
