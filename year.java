import java.io.*;
import java.util.*;
class year
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int y=sc.nextInt();
boolean isLeap=false;
if(y%4==0)
{
if(y%10==0)
{
if(y%400==0)
isLeap=true;
else
isLeap=false;
}
else
isLeap=true;
}
else
{
isLeap=false;
}
if(isLeap==true)
System.out.print("yes");
else
System.out.print("no");
}
}
