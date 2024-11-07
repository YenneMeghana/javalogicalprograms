import java.util.*;
class Circle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float pi = 3.14f;
float area, r;
System.out.println("Enter radius: ");
r = sc.nextFloat();
area = pi*r*r;
System.out.println("Area of circle is " +area);
}
}