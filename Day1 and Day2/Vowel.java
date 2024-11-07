import java.util.*;
class Vowel{
public static void main(String args[])
{
Scanner cha = new Scanner(System.in);
System.out.println("Dynamic");
System.out.println(" Enter a letter");
char ch = cha.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
System.out.println("Static");
char c = 'm';
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
}