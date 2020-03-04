class javaString2
{
public static void main(String args[])
{
StringBuffer s1=new StringBuffer("This is StringBuffer");
s1.append(" This is a sample program ");
System.out.println(s1);
s1.insert(21, "object");
System.out.println(s1);
s1.reverse();
System.out.println(s1);
StringBuffer s2=new StringBuffer("This is StringBuffer");
System.out.println(s2.replace(14,19,"Builder"));
}
}




