import java.util.*;
class Week{
public static void main(String args[]){
Scanner w = new Scanner(System.in);
System.out.print("Enter the day number between 1-7: ");
int d = w.nextInt();
if(d==1){
System.out.print("Sunday");
}
else if(d==2){
System.out.print("Monday");
}
else if(d==3){
System.out.print("Tuesday");
}
else if(d==4){
System.out.print("Wednesday");
}
else if(d==5){
System.out.print("Thursday");
}
else if(d==6){
System.out.print("Friday");
}
else if(d==7){
System.out.print("Saturday");
}
else{
System.out.print("Invalid");
}
}
}
