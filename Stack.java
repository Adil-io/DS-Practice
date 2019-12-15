import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class Stack{
	static Node top;
	Stack(){
		top=null;
	}
	static void push(int d){
		Node n=new Node(d);
		n.next=top;
		top=n;
	}
	static int pop(){
		int x=top.data;
		top=top.next;
		return x;
	}
	static int peek(){
		return top.data;
	}
	static void view(){
		Node t=top;
		while(t.next!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+"\n");
	}
	public static void main(String[] args){
		Stack s=new Stack();
		s.push(10);s.push(20);s.push(30);s.push(40);
		System.out.println(pop());
		view();
		System.out.println(peek());
		view();
	}
}