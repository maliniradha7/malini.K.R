import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.print("alphabets");
}
else
{
System.out.print("not");
}
}
}
