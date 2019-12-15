import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class removeLoopLinkList{
	static Node head;
	static Scanner sc=new Scanner(System.in);
	removeLoopLinkList(){
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
	static void createLoop(){
		System.out.println("\nLink Two Nodes to create Loop :-");
		System.out.print("Start : ");
		int p=sc.nextInt();
		System.out.print("End : ");
		int q=sc.nextInt();
		Node t=head,n=head;
		while(t.data!=p){
			t=t.next;
		}
	    while(n.data!=q){
	    	n=n.next;
	    }
	    t.next=n;	
	}
	static void detectLoop(){
		Node t=head,n=head;
		while(t.next!=null&&t!=null&&n!=null){
			n=n.next;
			t=t.next.next;
			if(n==t){
				removeLoop(n);	
				break;	
			}
		}	
	}
	static void removeLoop(Node n){
		Node p1=n;
		Node p2=n;
		int k=1;
		while(p1.next!=p2){
			p1=p1.next;
			k++;
		}
		p1=head;
		p2=head;
		for(int i=0;i<k;i++){
			p2=p2.next;
		}
		while(p2!=p1){
			p1=p1.next;
			p2=p2.next;
		}
		while(p2.next!=p1){
			p2=p2.next;
		}
		System.out.println("Loop is caused by "+p2.data+"--"+p2.next.data);
		p2.next=null;
	} 
	static void view(){
		Node t=head;
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	public static void main(String[] args){
		removeLoopLinkList rll=new removeLoopLinkList();
        System.out.print("Enter No of Elements in LinkedList : ");
        int n=sc.nextInt();
        System.out.println("Enter Elements in the LinkedList :-");
        for(int i=0;i<n;i++){
        	insert(sc.nextInt());
        }
        System.out.println("LinkedList Before Loop Creation :-");
        view();
        createLoop();  	
		detectLoop();
		System.out.println("LinkedList after Loop Removal :-");
		view();	
	}
}