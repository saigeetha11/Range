import java.util.*;
class Range
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the n value: ");
int n=s.nextInt( );
System.out.println("Enter the m value: ");
int m=s.nextInt( );
while(m>=n)
{
if(m%2==0)
System.out.println("Range= "+m);
m--;
}
}
}