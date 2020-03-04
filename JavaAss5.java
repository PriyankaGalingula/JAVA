import java.util.*;
class JavaAss5
{
public static void main(String args[])
{
int total=0,avg=0;
Scanner sc=new Scanner(System.in);
//System.out.println("enter no of Students");
//int n=Integer.parseInt(sc.nextLine());

String name=sc.nextLine();
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
total=(m1+m2+m3);
System.out.println(total);
avg=(total)/3;
System.out.println(avg);
if(avg>80)
{
System.out.println("First Class");
}
else if(avg>50)
{
System.out.println("second Class");
}
else if(avg>30)
{
System.out.println("pass Class");
}
else if(avg<30)
{
System.out.println("Fail Class");
}

}
}

