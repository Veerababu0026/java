import java.util.*;
class Pranavi1
{
	public static void main(String args[])
	{
		int a,b,i,j,composite;
		Scanner s=new Scanner(System.in);
		System.out.println("enter A: ");
		a=s.nextInt();
		System.out.println("enter B: ");
		b=s.nextInt();
		System.out.println("composite numbers are: ");
		for(i=a+1;i<b;i++)
		{
			if(i%2==0||i%3==0||i%5==0||i%7==0)
			{
				System.out.println(i);
			}
		}
	}
}