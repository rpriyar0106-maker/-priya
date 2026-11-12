package squareofdigits;

public class Cube {
	public static void main(String[] args)
	{
		int n=123;
		while(n>0)
		{
			int rem = n%10;
			System.out.println(rem*rem*rem);
			n=n/10;
		}
	}

}
