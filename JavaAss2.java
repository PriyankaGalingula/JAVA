import java.util.*;
class JavaAss2
{
public static void main(String args[])
{
int big;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
big=(a>b)?((a>c)? a:c):((b>c)? b:c);
System.out.println(big);
}
}
