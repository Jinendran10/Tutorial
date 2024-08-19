import java.util.*;
class multtable
{
	public static void main(String args[])
	{
		int i,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number to print multiplication table of:");
		n=s1.nextInt();
		System.out.println("The multiplication table of "+n+" is:");
		for(i=1;i<=10;i++)
		{
			System.out.println(""+n*i);
		}
	}
}	
