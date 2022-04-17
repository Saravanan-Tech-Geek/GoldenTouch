package aspire;

public class PyramidExampleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=6;
		for(int i=1;i<=term;i++) // rows
		{
		for(int j=term;j>=i;j--) //columns
		{
		System.out.print("* ");
		}
		System.out.println();//new line
		}
	}

}
