import java.util.*;
import java.time.LocalDate;
import java.text.DateFormat;  
import java.time.Period;

class AgeCalculator
{
public void calculateAge()
{
LocalDate l=LocalDate.of(1998,04,02);
LocalDate now=LocalDate.now();
Period diff=Period.between(l,now);
System.out.println(diff.getYears());
}
public static void main(String args[])
{
AgeCalculator a=new AgeCalculator();
a.calculateAge();
}
}
