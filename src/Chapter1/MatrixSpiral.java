package Chapter1;

public class MatrixSpiral {

	public void printSpiralForm(int [][] arr,int row, int col){
		int j=0;
		for(int i=0;i<row;i++){
			for(int k=0;k<col;k++){
				System.out.print(" "+arr[i][Math.abs(j)]);
				++j;
			}
			System.out.println();
			j=(j==col)?-(j-1):0;
		}
	}
	
	public static void main(String[] args) {
		
		int R = 4;
        int C = 6;
        int a[][] = {
        		{1,2,3,4,5,6},
        		{7,8,9,10,11,12},
        		{13,14,15,16,17,18},
        		{19,20,21,22,23,24}
        };
        MatrixSpiral m = new MatrixSpiral();
        m.printSpiralForm(a	, R, C);
	}
}
