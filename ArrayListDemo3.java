import java.util.*;
class ArrayListDemo3
{
public static void main(String args[])
{
ArrayList<Integer> alist1=new ArrayList<Integer>(5);
alist1.add(1);
alist1.add(2);
alist1.add(3);
alist1.add(4);
boolean flag1=alist1.contains(3);
if(flag1==true)
{
System.out.println("alist1 contains elements 2");
}
else
{
System.out.println("alist1 doesnt contains elements 2");
}
boolean flag2=alist1.contains(5);
if(flag2 == true)
{
System.out.println("alist1  contains elements 5");
}
else
{
System.out.println("alist1  doesnt contains elements 5");
}
}
}
