import java.util.*;
class Product{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
int pno;
String pname;
int cost;
int quantity;
System.out.println("enter product no:  ");
pno = obj.nextInt();
System.out.println("enter product name:  ");
pname = obj.next();
System.out.println("enter cost:  ");
cost = obj.nextInt();
System.out.println("enter quantity:  ");
quantity = obj.nextInt();
System.out.println(" Product no:"+pno);
System.out.println(" Product name:"+pname);
System.out.println(" Product cost:"+cost);
System.out.println(" Product quantity:"+quantity);
System.out.println(" Product bill:"+ cost*quantity);
}
}
