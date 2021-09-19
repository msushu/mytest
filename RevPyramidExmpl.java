
public class RevPyramidExmpl {

	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for (int k = i; k <= rows; k++)
            {
                System.out.print(" ");
            }
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			 
		System.out.println();
		}		
	}

}

