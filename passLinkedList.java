import java.util.Scanner;

public class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static LinkedList insert(LinkedList li, int data)
    {
	Node newNode=new Node(data);
	newNode.next=null;
	if(li.head==null)
		li.head=newNode;
	else{	
		Node last=li.head;
		while(last.next!=null){
				last=last.next;
		}
		last.next=newNode;
	}
	return li;
    }
    
    public static LinkedList insertBeg(LinkedList li, int data)
{
	Node newNode=new Node(data);
	newNode.next=null;
	if(li.head==null)
		li.head=newNode;
	else
		{
			newNode.next=li.head;
            li.head=newNode;
		}
	return li;
}

public static LinkedList insertIndex(LinkedList li,int index)
{ 
Node n1=new Node(data);
Node temp1=li.head;
int c=0;
if(li.head==null||index==0)
li.head=n1;
while(temp1!=null)
{
c++;
if(c==index)
{
n1.next=temp1.next;
temp1.next=n1;
break;
}
temp1=temp1.next;
}
return li;
}

public static LinkedList delete(LinkedList li)
{
     Node n1=new Node();
     n1=li.head;
     while(n1.next.next!=null)
          {
               n1=n1.next;
          }
               n1.next=null;
               return li;
}

public static LinkedList deleteBeg(LinkedList li){
     Node n1=new Node();
     if(li.head==null)
         System.out.println(“List is Empty”);
     else
         {
              Node temp=li.head;
            li.head=temp.next;
            temp.next=null;
            return li;
}
return li;
}

public static LinkedList delIndex(LinkedList li,int index){
Node current=li.head,prev=null;
if(index==0&&current!=null)
{
li.head=current.next;
System.out.println("Node deleted at index: "+ index);
}
int count=0;
while(current!=null){
if(count==index){
prev.next=current.next;
System.out.println("Node deleted at index: "+ index);
break;
}
else{
prev=current;
current=current.next;
count++;
}
}
if(current==null)
{
System.out.println("Node not found at index "+index);
}
return li;
}

public static void display(LinkedList li){
Node temp=li.head;
System.out.println("The Linked List is:");
while(temp!=null){
System.out.println(temp.data);
temp=temp.next;
}
}

public  static boolean Search(LinkedList li, int element)
{
Node n=li.head;
if(li.head==null)
System.out.println(“list not present”);
while(n!=null)
{
if(n.data==element)
return true;
n=n.next;
}
return false;
}

public static LinkedList reverse(LinkedList li)
{
     Node prev=null, current=li.head, next=null;
     while(current!=null)
        {
             next=current.next;
             current.next=prev;
             prev=current;
             current=next;
        }
              li.head=prev;
              return li;
}


public static void main(String args[]){
LinkedList li=new LinkedList();
li.insert(li,10);
li.insert(li,20);
li.insert(li,30);
li.insert(li,40);
li.insertBeg(li, 50);
li.display(li);
li.delIndex(li,11);
li.display(li);
}


}