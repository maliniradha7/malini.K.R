import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,j,k=0,l=0;
int s=sc.nextInt();
while(i>0)
{
    j=i%10;
    k=k*10+j;
    i=i/10;
}
if(k==l)
{
    System.out.print("yes");
}
else
{
    System.out.print("no");
}
}
}
