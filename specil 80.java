import java.util.*;
class Speciq5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int c=0;
int sp=str.length();
char t[]=new char[sp];
for(int i=0;i<sp;i++)
{
t[i]=str.charAt(i);
if(t[i]>='a'&&t[i]<='z'||t[i]>='A'&& t[i]<='Z'||t[i]>='0'&&t[i]<='9'||t[i]==' ')
{
}
else
{
System.out.println(t[i]);
c++;
}
}
System.out.println(c);
}
}