import java.util.*;
class Age
{
	public static void main(String args[])
	{
		int age,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		age=s.nextInt();
		if(age>=18)
		{
		System.out.println("eligible");
     		}
		else
		{
			System.out.println("not eligible");
			y=18-age;
			System.out.print("you are allowed to vote after");
			System.out.print(""+y);
			System.out.print("years");
		}
	}
}