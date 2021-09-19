
public class PerfectPyramidExmple {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			//decreasing white spaces
			for (int k = rows; k >= i; k--)
			{
				System.out.print(" ");
			}
			//increasing characters
			for(int j=1;j<=(i*2)-1;j++) 
	            {
	                System.out.print("*");
	            }
		System.out.println();
		}

	}

}
