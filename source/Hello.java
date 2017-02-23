
import java.util.*;
public class Hello
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Please enter your name....");
String name=sc.nextLine();
while(name.length()<3)
{
System.out.println("Please give the proper name....!!");
name=sc.nextLine();
}
System.out.println("Hello "+name+" welcome");
}
}
