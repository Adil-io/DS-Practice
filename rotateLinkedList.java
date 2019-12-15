import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class rotateLinkedList{
	static Node head;
	rotateLinkedList(){
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
		}
	}
	static int delete(){
		if(head==null){
			System.out.println("LinkedList is Empty ");
			return 0;
		}
		else{
			int x=head.data;
			head=head.next;
			return x;
		}
	}
	static void rotateLL(int r){
		for(int i=0;i<r;i++){
			insert(delete());
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
		rotateLinkedList rl=new rotateLinkedList();
		System.out.print("Enter no of Elements : ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements ");
		for(int i=0;i<n;i++){
			insert(sc.nextInt());
		}
		System.out.print("Enter no of Rotations to be Applied : ");
		int r=sc.nextInt();
		System.out.println("Before Rotating Elements "+r+" times.");
		view();
		System.out.println("\nAfter Rotating Elements "+r+" times.");
		rotateLL(r);
		view();
	}
}