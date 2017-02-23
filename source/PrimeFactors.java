


public class PrimeFactors
{
public static void main(String args[])
{
long num=Long.parseLong(args[0]);
for(long i=2;i*i<=num;i++)
{
while(num%i==0)
{
System.out.print(i+" ");
num=num/i;
}
}
}
}
