class Student_details{
public static void main(String args[]){
String st_name = "Akhil";
int st_no = 120;
float sub1=95, sub2=90, sub3=80;
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