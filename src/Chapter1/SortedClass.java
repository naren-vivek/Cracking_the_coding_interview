package Chapter1;

public class SortedClass {

	public static Integer getMinimum(int[] inp){
		int low=0;
		int high= inp.length-1;
		
			if(inp[0]< inp[1] && inp[0]< inp[high]){
				return low;
			}
		else if(inp[high]< inp[0] && inp[high]< inp[high-1]){
				return high;
			}
		
		while(low <= high){ 
			int mid=(low+high)/2;
			System.out.println(low+" "+mid+" "+high);
			if(inp[mid+1] > inp[mid] && inp[mid-1] > inp[mid]){
				return mid;
			}
			if(inp[mid] > inp[high]){
				low=mid+1;
			}
			else if(inp[mid] < inp[high]){
				high=mid-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] arr= new int[]{
				4,4,4,4,5,5,6,6,6,6,3,4,5
		};
	System.out.println(getMinimum(arr))	;
	}
}
