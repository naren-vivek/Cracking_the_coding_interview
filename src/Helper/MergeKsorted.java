package Helper;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKsorted {

	public int[] getSorted(int[][] arr, int size){
		
		int sum=0;
		for(int i=0;i<size;i++)
			sum+=arr[i].length;
		
		int[] output = new int[sum];
		
		//Arrays.fill(output, 0);
		for(int i=0;i<arr[0].length;i++){
			output[i]=arr[0][i];
		}
		int count=0;
		int intialSize = arr[0].length;
		for(int i=1;i<size;i++){
			intialSize+=arr[i].length;
			merge(output, arr[i], sum,count,intialSize);
			count+=arr[i-1].length+arr[i].length;
			System.out.println(count);
		}
		
		return output;
	}
	
	public void merge(int[] output, int[] arr2, int sum, int count, int intialSize){
		
		int n1=output.length;
		int n2= arr2.length;
		
		int[] tempOutput = new int[sum];
		int i=0,j=0,k=0;
		
		while(i<intialSize && j<n2){
			if(output[i] < arr2[j]){
				tempOutput[count]= output[i];
				i++;
			}else{
				tempOutput[count]=arr2[j];
				j++;
			}
			count++;
			System.out.println(count);
			System.out.println(Arrays.toString(tempOutput));
			PriorityQueue<E>
		}
		
		while(j<n2){
			tempOutput[count]=arr2[j];
			j++;
			count++;
		}
		 System.out.println(Arrays.toString(tempOutput));
		output=tempOutput;
	}
	
	public static void main(String[] args) {
		
	    int arr[][] = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
	    
	    MergeKsorted merge = new MergeKsorted();
	    int [] out=merge.getSorted(arr, 3);
	    System.out.println(Arrays.toString(out));
	}
}
