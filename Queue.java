
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class Queue{
	static int size=0;
	static Node front,rear;
	Queue(){
		front=null;
		rear=null;
	}
	static void enQueue(int d){
		Node n=new Node(d);
		if(front==null){
			front=n;
		}
		else{
			Node t=front;
			while(t.next!=null){
				t=t.next;
			}
			t.next=n;
		}
		rear=n;
	}
	static int deQueue(){
		int x=front.data;
		if(front==null){
			System.out.println("Empty");
		}
		else{
			x=front.data;
			front=front.next;
		}
		return x;
	}
	static void view(){
		Node t=front;
		while(t.next!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+"\n");
	}
	public static void main(String[] args){
	    Queue q=new Queue();
	    enQueue(10);enQueue(20);enQueue(30);enQueue(40);enQueue(50);enQueue(60);enQueue(70);
	    System.out.println(deQueue());
	    view();    
	}
}