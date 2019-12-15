import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class remDupLL{
	static Node head;
	remDupLL(){
		head=null;
	}
	static void insert(int d){
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
	}
	static void removeDuplicate(){
		Node n=head;
		while(n!=null){
			Node t=n;
			while(t.next!=null){
				if(t.next.data==n.data){
					t.next=t.next.next;
				}
				else{
					t=t.next;
				}
			}
			n=n.next;
		}
	}
	static void view(){
		Node t=head;
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}	
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		remDupLL l=new remDupLL();
		System.out.print("Enter no of Elements : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			insert(sc.nextInt());
		}
		System.out.println("LinkedList before Duplicate removal :-");
		view();
		System.out.println("\nLinkedList after Duplicate removal :-");
		removeDuplicate();
		view();
		
	}
}