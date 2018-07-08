import java.io.*;
import java.util.*;
class ten
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num,Count=1;
while(num>0)
{
num=num/10;
Count=Count+1;
}
System.out.print(" "+Count);
}
}
