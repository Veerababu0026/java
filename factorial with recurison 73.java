import java.util.*;
class Factorial1
{
	public static void main(String[] args) 
	{
        	int num;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		num=s.nextInt();
        	long factorial = fact(num);
        	System.out.println("Factorial of " + num + " = " + factorial);
   	 }
    	public static long fact(int num)
    	{
       		if (num >= 1)
            		return num * fact(num - 1);
        	else
            		return 1;
	}
}