import java.util.Scanner;
class Node{
	int data;
	Node next,prev;
	Node(int d){
		data = d;
	}
}
public class revDoublyLL{
	static Node head;
	revDoublyLL(){
		head=null;
	}
	static void insert(int d){
		if(head==null){
			head=new Node(d);
		}
		else{
			Node n=new Node(d);
			Node t=head;
			while(t.next!=null){
				t=t.next;
			}
			t.next=n;
			n.prev=t;
		}
	}
	static void reView(){
		Node t=head;
		while(t.next!=null){
			t=t.next;
		}
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.prev;
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		revDoublyLL rDLL = new revDoublyLL();
		System.out.print("Enter no of Elements : ");
		int n=sc.nextInt();
		System.out.println("Enter Elements :-");
		for(int i=0;i<n;i++){
			insert(sc.nextInt());
		}
		System.out.println("Reverse View of DoublyLinkedList Formed :-");
		reView();
	}
}