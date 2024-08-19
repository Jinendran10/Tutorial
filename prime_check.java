import java.util.*;
class prime_check
{
	public static void main(String args[])
	{
		int i,n;
		Scanner s1=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the number:");
		n=s1.nextInt();
		for(i=2;i<n/2;i++)
		{	
			if(n%i==0)
			{
				flag=1;
			}
			else
				continue;
		}
		if(flag==0)
		{
			System.out.println("The number is Prime!");
		}
		else
		{
			System.out.println("The number is not Prime!");
		}
		s1.close();
	}
}
		
			
