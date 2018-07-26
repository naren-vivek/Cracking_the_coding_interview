package Chapter1;

public class MaximumProfit {
	
	 void printMaxProfitDays(int[] arr){
		int ls=0;
		int rs=0;
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]> arr[ls]){
				//System.out.println(arr[i]+" "+arr[ls]);
				rs=i;
			}
			else if(arr[i] < arr[ls]){
				System.out.println(ls+" "+rs);
				ls=i;
				rs=i;
			}
			if(i==arr.length-1 && (ls!=rs)){
				System.out.println(ls+" "+(rs));
			}
		}
	}
	public static void main(String[] args) {
		
		MaximumProfit max = new MaximumProfit();
		 int price[] = {100, 180, 260, 310, 40, 535, 20};
	        int n = price.length;
	 
	        // fucntion call
	        max.printMaxProfitDays(price);
	}

}
