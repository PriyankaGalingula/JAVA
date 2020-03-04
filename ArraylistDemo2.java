import java.util.*;
class ArrayListDemo2
{
public static void main(String args[])
{
ArrayList<Integer> alist1=new ArrayList<Integer>(5);
alist1.add(1);
alist1.add(2);
alist1.add(3);
alist1.add(4);
System.out.println(alist1);
ArrayList<Integer> alist2=new ArrayList<Integer>(5);
alist2.add(5);
alist2.add(6);
alist2.add(7);
System.out.println(alist2);
alist1.addAll(alist2);
alist1.addAll(2,alist2);
System.out.println(alist1);
}
}
