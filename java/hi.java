import java.util.Scanner;
class hi
{
public static void main(String args[])
{
int rno;
String name;
char gender;
float fee;
Scanner sc=new Scanner(System.in);
rno=sc.nextInt();
name=scnextLine();
gender=sc.next().charAt(0);
fee=sc.nextFloat();
System.out.println("Roll number = "+rno);
System.out.println("Student Name = "+name);
System.out.println("Gender = "+gender);
System.out.println("Yearly fees = "+fee);
}
}