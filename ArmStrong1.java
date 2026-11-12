package squareofdigits;

public class ArmStrong1 {
	public static void main(String[] args)
	{
		for(int i=0;i<=10000;i++) 
		{
		int n=i;
		int copy=n;
		int sum=0;
		while(n>0)
		 {
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		 }
		System.out.println(copy);
	    }
	}
}