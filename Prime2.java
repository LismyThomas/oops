class prime2
{
public static void main(String args[])
{
int a=100;
boolean fl=false;
for (int i=2;i<=a-1;i++)
{
if (a%i==0)
{
fl=true;
break;
}
}
if (!fl)
System.out.println(" a prime number");
else
System.out.println("not prime number");

}
}