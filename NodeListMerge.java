import java.util.Scanner;

class LinkList{
	class Node{
		int data;
		Node next;
		Node(){}
	}
	
	Node head;
	
	void add(int d){
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
	
	void view(){
		Node t=head;
		while(t.next!=null){
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.print(t.data);
	}
	
	void merge(LinkList l){
		if(head==null){
			head=l.head;
		}
		else{		
			Node t=head;
			while(t.next!=null){
				t=t.next;
			}
			t.next=l.head;			
		}
	}
	
}
public class NodeListMerge{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		int k=sc.nextInt();
		int n=sc.nextInt();
		LinkList[] arr=new LinkList[k];
	
		for(int i=0;i<k;i++){
			LinkList li = new LinkList();
			for(int j=0;j<n;j++){
				li.add(sc.nextInt());
			}
			arr[i]=li;
		}
		
		LinkList list=new LinkList();
				
		for(int i=0;i<k;i++){
			list.merge(arr[i]);
		}
		
		list.sort();
		list.view();	
	}
}	