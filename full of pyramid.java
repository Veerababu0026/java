import java.util.Scanner;
class Pattern4
{
public static void main(String args[])
{
int i,j,k;
Scanner input=new Scanner(System.in);
System.out.println("Enter n value:");
int n=input.nextInt(); 
for(i=1;i<=n;i++)
	{
		for(k=0;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" "+i);
                }
		System.out.println();
	}

for(i=n-1;i>=1;i--)
	{
		for(k=0;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" "+i);
                }
		System.out.println();
	}
}
}