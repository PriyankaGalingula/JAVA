import java.util.*;
class ArrayListDemo4
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>(5);
list.add("priya");
list.add("jyothi");
list.add("achu");
System.out.println(list);
int value1=list.indexOf("priya");
System.out.println(value1);
int value2=list.indexOf("achu");
System.out.println(value2);

}
}
