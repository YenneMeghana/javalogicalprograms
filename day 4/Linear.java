class Linear{
public static void main(String args[]){
int i,n=5;
int a[]={10,20,30,40,50};
int ser = 60;
for(i=0; i<n; i++)
{
if(ser==a[i]){
System.out.println(ser+"is found");
break;
}
}
if(i==n){
System.out.println("the element not found");
}
}
}
