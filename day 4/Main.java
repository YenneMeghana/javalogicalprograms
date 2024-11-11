class Main{
public static void main(String args[]){
String str1 = "Meghana";
String str2 = "Hello";

System.out.println("the lenght of string 1 is "+str1.length());
System.out.println("the letter at 2nd position in  string 1 is "+str1.charAt(2));
System.out.println("the index of h in string 1 is "+str1.indexOf('h'));
System.out.println("the string 1 is change to uppercase: "+str1.toUpperCase());
System.out.println("the string 1 is change to lowercase: "+str1.toLowerCase());
System.out.println("the string letter replacement : "+str1.replace('a', 'e'));
System.out.println("comparing string 1 and string 2: "+str1equals(str2));
System.out.println("comparing string 1 and string 2: "+str1equalsIgnoranceCase(str2));
}
}