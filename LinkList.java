import java.util.Scanner;

public class LinkList{
	class Node{
		int data;
		Node next;
		Node(){}
	}
	Node head;
	void inFirst(int d){
		Node n=new Node();
		n.data=d;
		if(head==null){
			head=n;
		}
		else{
			n.next=head;
			head=n;
		}
	}
	void inLast(int d){
		Node n=new Node();
		n.data=d;
		if(head==null){
			head=n;
		}
		else{
			Node t=head;
			while(t.next!=null){
				t=t.next;
			}
			t.next=n;
		}
	}
	int size(){
		Node t=head;
		int c=0;
		while(t!=null){
			t=t.next;
			c++;
		}
		return c;
	}
	void inPos(int d,int p){
		Node n=new Node();
		n.data=d;
		int s=size();
		if(p==1){
			if(head==null){
				head=n;
			}
			else{
				n.next=head;
			    head=n;
			}
		}
		else if(p==s+1){
			Node t=head;
			while(t.next!=null){
				t=t.next;
			}
			t.next=n;
		}
		else if(p>1&&p<=s+1){
			Node t=head;
			for(int i=1;i<p-1;i++){
				t=t.next;
			}
			n.next=t.next;
			t.next=n;
		}
		else{
			System.out.println("Insertion at position "+p+" is Not Possibe");
		}
	}
	void delFirst(){
		if(head==null){
			System.out.println("LinkedList Empty");
		}
		else{
			head=head.next;
		}
	}
	void delLast(){
		if(head==null){
			System.out.println("LinkedList Empty");
		}
		else{
			Node t=head;
			while(t.next.next!=null){
				t=t.next;
			}
			t.next=null;
		}
	}
	void delPos(int p){
		if(head==null){
			System.out.println("LinkedList Empty");
		}
		else{
			int n=size();
			if(p==1){
				head=head.next;
			}
			else if(p==n){
				Node t=head;
				while(t.next.next!=null){
					t=t.next;
				}
				t.next=null;
			}
			else if(p>1&&p<n){
				Node t=head;
				for(int i=1;i<p-1;i++){
					t=t.next;
				}
				t.next=t.next.next;
			}
			else{
				System.out.println("Deletion at position "+p+" is Not Possible");
			}
		}
	}
	void delData(int d){
		if(head==null){
			System.out.println("LinkedList Empty");
		}
		else{
			if(head.data==d){
				head=head.next;
			}
			else{		
				Node t=head;
		     	boolean b=true;
			    while(t.next.data!=d){
			        t=t.next;
				    if(t.next==null){		    	
					    System.out.println("Deletion Not Possible as Element "+d+" Not Found");
					    b=false;
					    break;
				    }
			    }	    
			    if(b){
				    t.next=t.next.next;
			    }
			}	
		}
	}
	void recurseRev(Node head){
		if(head!=null){
			recurseRev(head.next);
			System.out.print(head.data+" ");
		}
	}	
	void reverse(){
		Node prev=null,current=head,next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}	
	void sort(){
		int temp;
		Node i=head;
		while(i.next!=null){
			Node j=head;
			while(j.next!=null){
				if(j.data>j.next.data){
					temp=j.data;
					j.data=j.next.data;
					j.next.data=temp;
				}
				j=j.next;
			}
			i=i.next;
		}
	}
	void removeDuplicates(){
		Node p1=head;
		while(p1.next!=null){
			Node p2=p1;
			while(p2.next!=null){
				if(p1.data==p2.next.data){
					p2.next=p2.next.next;
				}
				else{
					p2=p2.next;
				}
			}
			p1=p1.next;
		}
	}
	void view(){
		Node t=head;
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		LinkList list=new LinkList();
		System.out.print("Enter size : ");
		int n=sc.nextInt();
		System.out.println("Enter elements :-");
		while(n-->0){
		//	list.inFirst(sc.nextInt());
		    list.inLast(sc.nextInt());
		}
		list.inPos(10,9);
//		list.delFirst();
//		list.delLast();
		list.delPos(8);
		list.delData(8);
		System.out.println("View of LinkedList :-");
		list.view();
		System.out.println("Reverse View using Recursion :-");
		list.recurseRev(list.head);
/*		System.out.println("\nLinkedList head before Reversing = "+list.head.data);
		System.out.println("Reversing LinkedList :-");
		list.reverse();
		list.view();
		System.out.println("LinkedList head after Reversing = "+list.head.data); */
		System.out.println("\nSize = "+list.size());
		System.out.println("Removing Duplicates");
		list.removeDuplicates();
		list.view();
		System.out.println("Sorting LinkedList");
		list.sort();
		list.view();
		System.out.println("Size = "+list.size());
	}
}