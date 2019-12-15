import java.util.Scanner;
import java.util.Random;
class Node{
	int data,pri;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class PriorityQueue{
	static Node head;
	PriorityQueue(){
		head=null;
	}
	static int k=1;
	static int max=1;
	static void insert(int d){
		Random r=new Random();
		k=r.nextInt((100 - 2)+1)+2;
		Node n=new Node(d);
		if(head==null){
			head=n;
			head.pri=k;
		}
		else{
			boolean flag=true;
			Node t=head;
			while(t.next!=null){
				if(t.data==d){
					n.pri=t.pri;
					flag=false;
				}
				t=t.next;
			}
			if(flag){
				n.pri=k;
			}
			t.next=n;
		}
		Node t=head;
		max=t.pri;	
		while(t!=null){
			if(t.pri>max){
				max=t.pri;
			}
			t=t.next;
		}
	}
	static boolean contains(int d){
		if(head.data==d){
			return true;
		}
		else{
			Node t=head;
			while(t.data!=d){
				t=t.next;
				if(t==null){
					return false;
				}
			}
			return true;
		}
	}
	static void remove(){
		if(head.pri==max){
			head=head.next;
			Node t=head;
	    	max=t.pri;	
	     	while(t!=null){
		    	if(t.pri>max){
			    	max=t.pri;
		    	}
	 	    	t=t.next;
	    	}
		}
		else{
			Node t=head;
			boolean flag=true;
			while(t.next.pri!=max){
				t=t.next;
			}
			t.next=t.next.next;
			t=head;
			max=t.pri;	
	     	while(t!=null){
		    	if(t.pri>max){
			    	max=t.pri;
		    	}
	 	    	t=t.next;
	    	}	
		}
	}
	static int peek(){
		Node t=head;
		while(t!=null){
			if(t.pri==max){
				return t.data;
			}
			t=t.next;
		}
		return -1;
	}
/*	static void view(){
		Node t=head;
		while(t!=null){
			System.out.println(t.data+" "+t.pri);
			t=t.next;
		}
	} */
	static void disp(){
		Node t=head;
	    for(int i=1;i<=max;i++){
	    	while(t!=null){
	    		if(i==t.pri){
	    			System.out.print(t.data);
	    			break;
	    		}
	    		t=t.next;
	    	}
	    	t=head;
	    }
	} 
		
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args){
		PriorityQueue pq=new PriorityQueue();
		insert(4);
		insert(2);
		insert(5);
		insert(3);
		insert(1);
		insert(6);
		System.out.println("Element with Highest Priority : "+peek());
		System.out.println("PQ Before Remove() :");
		disp();	
		remove();
		System.out.println("\nPQ After Remove() :");
		disp();
		System.out.println("\nEnter Element to be searched : ");
		int x=sc.nextInt();
		System.out.println("is Element "+x+" Contained in PQ : "+contains(x));
		System.out.println("Element with Highest Priority : "+peek());
	}
}