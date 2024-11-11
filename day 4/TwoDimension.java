import java.util.Scanner;
class TwoDimension{
public static void main(String args[]){
int r, c, i, j;
Scanner obj = new Scanner(System.in);
r = obj.nextInt();
c = obj.nextInt();
int a[][] = new int[r][c];
System.out.println("Enter the elements of array: ");
for(i=0;i<r;i++){
for(j=0;j<c;j++){
a[i][j] = obj.nextInt();
}
}
System.out.println("the elements in array are: ");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.println(" "+a[i][j]);
}
System.out.println();
}
}
}