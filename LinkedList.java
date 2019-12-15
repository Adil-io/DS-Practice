import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class LinkedList{
	
	static Node head;
	static int size;
	LinkedList(){
		size=0;
		head=null;
	}
	static void insertFirst(int d){
		Node n=new Node(d);
		n.next=head;
		head=n;
		size++;
	}
	static void insertLast(int d){
		Node n=new Node(d);
		Node t=head;
		if(t==null){
			head=n;
		}
		else{
			while(t.next!=null){
				t=t.next;
	     	}
	    	t.next=n;		
		}
		size++;	
	}
	static void insertPos(int d,int p){
		if(p==1){
			insertFirst(d);
		}
		else if(p==size+1){
			insertLast(d);		
		
		}
		else{
			Node n=new Node(d);
			Node t=head;
			for(int i=1;i<p-1;i++){
				t=t.next;
			}
			n.next=t.next;
			t.next=n;
			size++;
		}
	}
	static void deleteFirst(){
		head=head.next;
		size--;
	}
	static void deleteLast(){
		if(head==null){
			System.out.println("LinkedList is aready Empty");
		}
		else{
			Node t=head;
			while(t.next.next!=null){
				t=t.next;
			}
			t.next=null;
			size--;
		}
	}
	static void deletePos(int p){
		if(p==1){
			deleteFirst();
		}
		else if(p==size){
			deleteLast();
		}
		else{
			Node t=head;
			for(int i=1;i<p-1;i++){
				t=t.next;
			}
			t.next=t.next.next;
			size--;
		}
	}
	static void deleteData(int d){
		Node t=head;
		if(head.data==d){
			head=head.next;
		}
		else{
			while(t.next.data!=d){
			t=t.next;
		    }
		t.next=t.next.next;
		size--;
		}
		
	}
	static void view(){
		Node t=head;
		while(t.next!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+"\n");
	}
	static Node revView(Node head){
		if(head==null){
			return head;
		}
		else{
			revView(head.next);
			System.out.print(head.data+" ");
		}
		return head;
	}
	public static void main(String[] args){
		LinkedList l=new LinkedList();
		insertFirst(10);insertFirst(20);insertFirst(30);insertFirst(40);insertFirst(50);
		view();
		insertLast(5);
		deleteFirst();
		deleteLast();
		insertPos(100,4);
		view();
		deleteData(40);
		view();
	//	revView(head);
	}
}