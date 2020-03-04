import java.util.*;
class JavaAss4
{
public static void main(String args[])
{
int big;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
big=(a>b)?((a>c)? a:c):((b>c)? b:c);
System.out.println("highest value" +big);
if(a!=big)
{
if(a<big && a>c && a>b)
{
System.out.println("second highest value" +a);
}
}


else if(b<big && b>c && b>a)
{
System.out.println("second highest value" +b);
}


else if (c<big && c>a && c>b)
{
System.out.println("second highest value" +c);
}
}


}