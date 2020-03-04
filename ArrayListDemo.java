import java.util.*;
class ArrayListDemo
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("priya");
list.add("jyothi");
list.add("achu");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
