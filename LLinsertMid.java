import java.util.Scanner;
public class LLinsertMid {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static void insertMiddle(Node prev, int data) {
		if(prev==null) {
			System.out.println("Prev Node can't be null");
			return;
		}
		Node new_Node=new Node(data);
		new_Node.next=prev.next;
		prev.next=new_Node;
	}
	public static void insertEnd(int data) {
		if(head==null) {
			Node new_Node=new Node(data);
			head=new_Node;
			return;
		}
		Node temp=head;
		Node new_Node = new Node(data);
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_Node;
	}
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		return;
	}
	public static int length() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void LLinsertMid(int data) {
		int l=length();
		int	mid=l/2;
		int i=0;
		Node temp=head;
		Node prev=null;
		Node new_Node = new Node(data);
		while(i<mid) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		new_Node.next=temp;
		prev.next=new_Node;
	}
	public static void main(String args[]) {
		LLinsertMid li=new LLinsertMid();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list:- ");
		int n=sc.nextInt();
		System.out.println("Enter the elements:- ");
		for(int i=0;i<n;i++) {
			li.insertEnd(sc.nextInt());
		}
		System.out.println("Enter the element you want to insert at middle:-");
		int mid_el=sc.nextInt();
		System.out.println("Before insertion in middle");
		li.display();
		LLinsertMid(mid_el);
		System.out.println("\nAfter insertion in middle");
 		li.display();
 		sc.close();
	}
}