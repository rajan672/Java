import java.io.*;
 class complex
{
int a,b;
public static int c;
public complex(int x,int y)
{
a=x;b=y;
c++;
}
public static String add(complex n1,complex n2)
{
int a1=n1.a+n2.a;
int b1=n1.b+n2.b;
if(b1<0)
return (a1+" "+b1+"i");
else
return (a1+" "+b1+"i");
}
public static String sub(complex n1,complex n2)
{
int a1=n1.a-n2.a;
int b1=n1.b-n2.b;
if(b1<0)
return (a1+" "+b1+"i");
else
return (a1+" "+b1+"i");
}
public static String mul(complex n1,complex n2)
{

int a1=n1.a*n2.a;
int b1=n1.b*n2.b;
int v1=n1.a*n2.b;
int v2=n2.a*n1.b;
int vi=v1+v2;
if(vi<0)
return(a1-b1+" "+vi+"i");
else
return(a1-b1+"+"+vi+"i");
}
}
class lab2
{
public static void main(String a[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int x,y;
System.out.println("enter the no for complex1:");
x=Integer.parseInt(in.readLine());
y=Integer.parseInt(in.readLine());
System.out.println("enter the no for complex2:");
int m=Integer.parseInt(in.readLine());
int n=Integer.parseInt(in.readLine());
complex c1=new complex(x,y);
complex c2=new complex(m,n);
System.out.println("addition:"+complex.add(c1,c2));
System.out.println("subtraction:"+complex.sub(c1,c2));
System.out.println("multiplication:"+complex.mul(c1,c2));
System.out.println("count="+complex.c);
}
}