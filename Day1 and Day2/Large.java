import java.util.*;
class Large{
public static void main(String args[]){
Scanner l = new Scanner(System.in);
System.out.println("enter a: ");
int a = l.nextInt();
System.out.println("enter b: ");
int b = l.nextInt();
System.out.println("enter c: ");
int c = l.nextInt();

if(a>b){
  if(a>c){
    System.out.println("a is big");
   }
   else{
     System.out.println("c is big");
   }
}
else{
   if (b>c){
    System.out.println("b is big");
   }
   else{
     System.out.println("c is big");
   }
}

}
}