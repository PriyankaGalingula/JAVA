import java.util.*;
class JavaAss14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int t=fact(f);
System.out.println(t);
}

static int fact(int a)
{
if(a==0)
{
return 1;
}
else
{
return a*fact(a-1);
}
}
}
