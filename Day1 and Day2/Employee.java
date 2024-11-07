import java.util.Scanner;
class Employee{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String emp_name ;
int emp_num;
float emp_salary;
System.out.println("Name of the employee: ");
emp_name = sc.next();
System.out.println("Employee number: ");
emp_num = sc.nextInt();
System.out.println("Employee salary: ");
emp_salary = sc.nextFloat();
System.out.println("Name of the employee: "+emp_name);
System.out.println("Employess number: "+emp_num);
System.out.println("Employee salary: "+emp_salary);
}
}