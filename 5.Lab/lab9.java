import java.io.*; import java.util.*; class Link < T > {
public T data;
public Link nextLink; public Link(T d) {
data = d;
}
public void printLink() { System.out.println("item:" + data);
}
}
class LinkList < T > { private Link first; private Link last; public LinkList() {
first = null;
}
public boolean isEmpty() { return first == null;
}
public void insert(T d) { Link link = new Link(d); if (first == null) {
link.nextLink = null; first = link;
last = link;
} else {
last.nextLink = link; link.nextLink = null; last = link;
}
}
public Link delete() { Link temp = first; first = first.nextLink; return temp;
}
public void printList() { Link currentLink = first;
while (currentLink != null) {
 
currentLink.printLink(); currentLink = currentLink.nextLink;
}
System.out.println("");
}
}
class template {
public static void main(String[] args) { int i, c = 1, ch, p1 = 0, p2 = 0, p3 = 0; Scanner in = new Scanner(System.in);
LinkList < Integer > l = new LinkList(); LinkList < String > s = new LinkList(); LinkList < Double > d = new LinkList(); do {
System.out.println("1.INTEGER	2.STRING	3.DOUBLE 4.exit"); System.out.println("enter ur choice:");
c = in .nextInt(); switch (c) {
case 1:
do {
if (p1 == 1) break;
System.out.println("1.insert 2.delete 3.display 4.exit"); System.out.println("enter ur choice:");
ch = in .nextInt(); switch (ch) {
case 1:
System.out.println("Integer list"); System.out.println("enter the insert value:"); i = in .nextInt();
l.insert(i); break;
case 2:
l.delete();
System.out.println("data deleted"); break;
case 3:
l.printList(); break;
case 4:
p1 = 1;
continue;
}
} while (c != 0); break;
case 2:
do {
if (p2 == 1) break;
System.out.println("1.insert 2.delete 3.display 4.exit"); System.out.println("enter ur choice:");
ch = in .nextInt(); switch (ch) {
case 1:
System.out.println("STRING list"); System.out.println("enter the insert value:"); String a = in .next();
s.insert(a); break;
 
case 2:
s.delete(); System.out.println("data deleted"); break;
case 3:

s.printList(); break;
case 4:
p2 = 1;
continue;
}
} while (c != 0); break;
case 3:
do {
if (p3 == 1) break;
System.out.println("1.insert 2.delete 3.display 4.exit"); System.out.println("enter ur choice:");
ch = in .nextInt(); switch (ch) {
case 1:
System.out.println("DOUBLE list"); System.out.println("enter the insert value:"); double x = in .nextDouble();
d.insert(x); break;
case 2:
d.delete(); System.out.println("data deleted"); break;
case 3:

d.printList(); break;
case 4:
p3 = 1;
continue;
}
} while (c != 0); break;
case 4:
System.exit(0);
}
} while (c != 0);
}
}
