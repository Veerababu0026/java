import java.util.*;
class Vowels
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("string1:");
String s1=s.nextLine();
int len=s1.length();
int v=0;
for(int i=0;i<len;i++)
{ 
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
{
v=v+1;
}
}
System.out.println("vowels:"+v);
}
}