import java.util.Scanner;

class Node{
	int data;
	Node prev,next;
	Node(int d){
		data=d;
	}
}
public class circularDoublyLL{
	
	static Node head,tail;
	static int size;
	circularDoublyLL(){
		head=null;
		tail=null;
		size=0;
	}
	static void insertFirst(int d){
		Node n=new Node(d);
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			tail.next=n;
			n.next=head;
			head.prev=n;
			n.prev=null;
			head=n;
		}
		size++;
	}
	static void insertLast(int d){
		Node n=new Node(d);
		Node t=head;
		if(t==null){
			head=n;
			tail=n;
		}
		else{
			while(t!=tail){
				t=t.next;
	     	}
	    	t.next=n;
	    	n.prev=t;
	    	n.next=head;
	    	tail=n;		
		}
		size++;	
	}
	static void insertPos(int d,int p){
		if(p>=size+1||p<0){
			System.out.println("Invalid Position");
		}
		else if(p==0){
			insertFirst(d);
		}
		else if(p==size){
			insertLast(d);		
		}
		else{
			int f=0;
			Node n=new Node(d);
			Node t=head;
			Node c=null;
			for(int i=1;i<p;i++){
				c=t.next;
				t=t.next;
				f++;
			}
			if(f==0){
				c=t.next;
			}
			n.next=t.next;
			n.prev=t;
			t.next=n;
			c.prev=n;
			size++;
		}
	}
	static void deleteFirst(){
		head=head.next;
		tail.next=head;
		size--;
	}
	static void deleteLast(){
		tail=tail.prev;
		tail.next=head;
		size--;
	}
	static void deletePos(int p){
		if(p>=size+1||p<1){
			System.out.println("Invalid Position");
		}
		else if(p==1){
			deleteFirst();
		}
		else if(p==size){
			deleteLast();		
		}
		else{
			int f=0;
			Node t=head;
			Node c=null;
			for(int i=1;i<p-1;i++){
				c=t.next.next;
				t=t.next;
				f++;
			}
			if(f==0){
				c=t.next.next;
			}
			t.next=c;
			c.prev=t;
			size--;
		}
	}
	static void view(){
		Node t=head;
		System.out.print("Forward Traversal :\n");
		while(t!=tail){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+"\n");
	}
	static void viewRev(){
		Node t=tail;
		System.out.print("Backward Traversal :\n");
		while(t!=head){
			System.out.print(t.data+" ");
			t=t.prev;
		}
		System.out.print(t.data+"\n");
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		circularDoublyLL cdll=new circularDoublyLL();
		boolean flag=true;
		while(flag)
		{
			System.out.println("----------<Circular Doubly LinkedList Menu>----------");
		    System.out.println("1. Add Item to the CircularDoublyLinkList at Start");
		    System.out.println("2. Add Item to the CircularDoublyLinkList at Last");
	     	System.out.println("3. Add Item to the CircularDoublyLinkList at Position");
	  	    System.out.println("4. Delete First Item from the CircularDoublyLinkList");
	    	System.out.println("5. Delete Last Item from the CircularDoublyLinkList");
	    	System.out.println("6. Delete First Item from the CircularDoublyLinkList at a Position");
	    	System.out.println("7. View Forward Traversal of CircularDoublyLinkList");
	    	System.out.println("8. View Reverse Traversal of CircularDoublyLinkList");
	    	System.out.println("9. Exit");
	     	System.out.print("Enter your Choice : ");
	    	int choice=sc.nextInt();
	    	int p,v;
	    	switch(choice)
	    	{
		    	case 1:
		    		   System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               insertFirst(v);
		               break;
	       	    case 2:
	       	    	   System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               insertLast(v);
		               break;
		        case 3:
		        	   System.out.print("Enter Position : ");
		               p=sc.nextInt();
		               System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               insertPos(v,p);
		               break;
	     	    case 4:
	     	    	   deleteFirst();
		               break;
		        case 5:
		        	   deleteLast();
		               break;
		        case 6:
		        	   System.out.print("Enter Position : ");
		               p=sc.nextInt();
		               deletePos(p);
		               break;
		        case 7:
		        	   view();
		               break;
		        case 8:
		        	   viewRev();
		               break;       
		        case 9:
		        	   flag=false;
		        	   System.out.print("-----Program Exiting-----");
		               break;
		        default:
		        	   System.out.print("Invalid choice");	
	    	}	
		}
	}
}