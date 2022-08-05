import java.io.*;

interface StackOperation { public void push(int i); public void pop(); public void display();
}

class StackDemo implements StackOperation { int stack[] = new int[5];
int top = -1; int i;

public void push(int item) { if (top >= 4) {
System.out.println("overflow");
} else {
top = top + 1; stack[top] = item;
System.out.println("item pushed: " + stack[top]);
}
}

public void pop() { if (top < 0)
System.out.println("underflow"); else {
System.out.println("item popped: " + stack[top]); top = top - 1;
}
}

public void display() { if (top < 0)
System.out.println("No Element in stack"); else {
for (i = 0; i <= top; i++) System.out.println("element:" + stack[i]);
}
}
}
 
class lab5 {
public static void main(String args[]) throws IOException { int ch = 0;
int i;
StackDemo s = new StackDemo();
BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); System.out.println("ARRAY STACK");
do {
try {
System.out.println("1.push 2.pop 3.display 4.exit"); System.out.println("enter ur choice:");
ch = Integer.parseInt( in .readLine()); switch (ch) {
case 1:
System.out.println("enter the value to push:"); i = Integer.parseInt( in .readLine());
s.push(i); break;
case 2:
s.pop(); break;
case 3:
System.out.println("the elements are:"); s.display();
break; default:
break;
}
} catch (IOException e) { System.out.println("io error");
}
if (ch == 4)
System.out.println("----------Program Finished	");
} while (ch != 4);
}
}