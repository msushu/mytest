
public class PyramidExmpl {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for (int k = rows; k >= i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
	            {
	                System.out.print(" * ");
	            }
		System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i+1;j++) 
            {
                System.out.print(" ");
            }
			for (int k = rows-1; k >= i; k--)
			{
				System.out.print(" * ");
			}
			
		System.out.println();
		}
	}


	}


