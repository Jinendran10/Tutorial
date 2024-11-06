import java.util.*;
class sec_small
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,n,temp,small=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=s1.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Element:");
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("The second smallest element is:");
		for(i=0;i<n;i++)
		{
			small=a[1];
		}
		System.out.print(""+small);
		s1.close();
	}
}
		
