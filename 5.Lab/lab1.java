//Queue package:
package queuepackage;
public class queue2
{
private int maxsize;
private long[] queArray;
private int front;
private int rear;
private int nitems;
public queue2(int s)
{
maxsize=s;
queArray=new long[maxsize];
front=0;
rear=-1;
nitems=0;
}
public void insert(long j)
{
if(rear==maxsize-1)
rear=-1;
queArray[++rear]=j;
nitems++;
}
public long remove()
{
long temp=queArray[front++];
if(front==maxsize)
front=0;
nitems--;
return temp;
}
public long peekFront()
{
return queArray[front];
}
public boolean isEmpty()
{
return(nitems==0);
}
public boolean isFull()
{
return(nitems==maxsize);
}
public int size()
{
 return nitems;
}
}

//Stack package:

package stackpackage;
public class stack2
{
int []a;
int top;
public stack2(int n)
{
a=new int[n];
top=-1;
}
public void push(int val)
{
if(top==a.length-1)
{
System.out.println("stack overflow");
}
else
{
top++;
a[top]=val;
}
}
public void pop()
{
if(top==-1)
{
System.out.println("stack underflow");
}
else
{
System.out.println("element popped"+a[top]);
top--;
}
}
public void display()
{
if(top==-1)
{
System.out.println("stack empty");
}
else
{
for(int i=top;i>=0;i--)
{
System.out.println("sstack element :"+a[i]);
}
}
}
}


//Main program:

import queuepackage.queue2;
import stackpackage.stack2;
import java.io.*;
public class lab1
{
public static void main(String args[])
{
BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
int c;
stack2 s;
int n;
try
{
do
{
System.out.println("1.stack 2.queue");
c=Integer.parseInt(sc.readLine());
switch(c)
{
case 1:
System.out.println("enter the size of stack");
n=Integer.parseInt(sc.readLine());
s=new stack2(n);
int choice;
do
{
System.out.println("1.push,2.pop,3.display,0.exit,enter your choice:");
choice=Integer.parseInt(sc.readLine());
switch(choice)
{
case 1:
int value;
System.out.println("enter the element to push:");
value=Integer.parseInt(sc.readLine());
s.push(value);
break;
case 2:
s.pop();
break;
case 3:
s.display();
break;
case 0:
break;
default:System.out.println("invalid choice");
}
}while(choice!=0);
break;
case 2:
 queue2 thequeue = new queue2(5);
 thequeue.insert(10);
 thequeue.insert(20);
 thequeue.insert(30);
 thequeue.insert(40);
 thequeue.remove();
 thequeue.remove();
 thequeue.remove();
 thequeue.insert(50);
 thequeue.insert(60);
 thequeue.insert(70);
 thequeue.insert(80);
 while(!thequeue.isEmpty())
 {
  long n1= thequeue.remove();
  System.out.print(n1);
  System.out.print("");
 }
  System.out.println("");
  break;
}
}while(c!=0);
}
catch(Exception e)
{}               
}
}