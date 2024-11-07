import java.util.Scanner;
class Student{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String st_name;
int st_no;
float sub1, sub2, sub3;
System.out.println("Enter student name: ");
st_name = sc.next();
System.out.println("Enter student number: ");
st_no = sc.nextInt();
System.out.println("Enter English marks: ");
sub1 = sc.nextFloat();
System.out.println("Enter Hindi marks: ");
sub2 = sc.nextFloat();
System.out.println("Enter Telugu marks: ");
sub3 = sc.nextFloat();
float total = sub1+sub2+sub3;
float avg = (total/300)*100;
System.out.println("name of the student: "+st_name);
System.out.println("Roll no: "+st_no);
System.out.println("English marks: "+sub1);
System.out.println("Hindi marks: "+sub2);
System.out.println("Telugu marks: "+sub3);
System.out.println("Total marks: "+total);
System.out.println("Percentage: "+avg);
}

}