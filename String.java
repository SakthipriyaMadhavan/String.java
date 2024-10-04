import java.util.Scanner;
import java.util.Arrays;
public class Str
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
String a = new String();
a=sc.nextLine();
String a1=new String();
a1 = sc.nextLine();
System.out.println(a==a1);
System.out.println(a.equals(a1));
System.out.println(a.indexOf("hello"));
String n1= a.replace("h","H");
System.out.println(n1);
System.out.println(a);
String n2 = a.trim();
System.out.println(n2);
//String n3=a.split("//n");
//System.out.println(n3);
String n4 = a1.substring(1,5);
System.out.println(n4);
boolean n5 = a1.contains("hi");
System.out.println(n5);
System.out.println("for split:");
String n6[]= a.split("\\s");
System.out.println(Arrays.toString(n6));
System.out.println("empty check");
boolean c=a.isEmpty();
System.out.println(c);
System.out.println("for join:");
String n7[] = new String[5];
for(int i=0;i<5;i++)
{
n7[i]=sc.nextLine();
}
String n8=String.join("+",n7);
System.out.println(n8);
System.out.println("=====");
System.out.println(a.equals(a1));
System.out.println(a.equalsIgnoreCase(a1));
}
}
