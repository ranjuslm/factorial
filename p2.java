import java.io.*;
import java.util.*;
class p2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long fact=1;
long n=sc.nextLong();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("fact:"+fact);
}
}
