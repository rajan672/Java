package date;
public class day
{
int day,month,year,y,m,tot_day=0;
int day_mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
String week[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
public void days(int a,int b,int c)
{
valid(a,b,c);
day=a;
month=b;year=c;
for(y=0;y<year;y++)
if(y%4==0)
tot_day+=366;
else
tot_day+=365;
if(month>2 && year%4==0)
day_mon[1]=29;
for(m=0;m<(month-1);m++)
tot_day+=day_mon[m];
tot_day+=day;
System.out.println(day+"-"+month+"-"+year+"  this is :"+"="+week[(tot_day+4)%7]);
}
public void valid(int dd,int mm,int yy)
{
if(yy<1)
{
System.out.println("invalid....");
System.exit(0);
}
switch(mm)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
if(dd>31 || dd<1)
{
System.out.println("invalid......");
System.exit(0);
}
break;
case 4:
case 6:
case 9:
case 11:
if(dd>30 || dd<1)
{
System.out.println("invalid......");
System.exit(0);
}
break;
case 2:
if(yy%4!=0 && dd>=29 && dd<1)
{
System.out.println("invalid......");
System.exit(0);
}
else if(yy%4==0 || dd>28 || dd<1)
{
System.out.println("invalid......");
System.exit(0);
}break;
default:
System.out.println("invalid......");
System.exit(0);
}
}
}

//Main program:

import date.*;
import java.io.*;
class lab4
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
day d=new day();
System.out.println("enter the date:(dd mm yyyy):");
int dd=Integer.parseInt(in.readLine());
int mm=Integer.parseInt(in.readLine());
int yy=Integer.parseInt(in.readLine());
d.days(dd,mm,yy);
}
}