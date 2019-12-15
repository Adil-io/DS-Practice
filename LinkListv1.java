import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(){
		data=0;
		next=null;
	}
	public void setData(int d){
		data=d;
	}
	public void setNext(Node n){
		next=n;
	}
	public int getData(){
		return data;
	}
	public Node getNext(){
		return next;
	}
}
public class LinkListv1{
	static int size;
    static Node head;
    LinkListv1(){
    	head=null;
    }
    static void insertFirst(int d){
    	Node n;
    	n=new Node();
    	n.setData(d);
    	n.setNext(head);
    	head=n;
    	size++;
    }
    static void insertLast(int d){
    	Node n,t;
    	n=new Node();
    	n.setData(d);
    	t=head;
    	if(t==null){
    		head=t;
    	}
    	else{
    		while(t.getNext()!=null){
    			t=t.getNext();
    		}
    		t.setNext(n);
    	}
    	size++;
    }
    static void insertPos(int d,int p){
    	if(p==1){
    		insertFirst(d);
    	}
    	else if(p==size+1){
    		insertLast(d);
    	}
    	else{
    		Node n,t;
    		n=new Node();
    		n.setData(d);
    		t=head;
    		int i=1;
    		while(i<p-1){
    			i++;
    			t=t.getNext();	
    		}
    		n.setNext(t.getNext());
    		t.setNext(n);
    		size++;
    	}
    		
    }
    static void insertMid(int d){
    	Node n,t;
    	n=new Node();
    	n.setData(d);
    	int i=1;
    	t=head;
    	while(i<size/2){
    		i++;
    		t=t.getNext();
    	}
    	n.setNext(t.getNext());
    	t.setNext(n);
    	size++;
    }
    static void deleteFirst(){
    	
    }
    static void view(){
    	Node n=head;
    	for(int i=0;i<size;i++){
    		System.out.print(n.getData()+" ");
    		n=n.getNext();
    	}
    }
    public static void main(String[] args){
    	LinkListv1 ll=new LinkListv1();
        insertFirst(5);insertFirst(2);insertFirst(3);insertFirst(1);insertFirst(4);insertFirst(7);insertFirst(6);insertFirst(8);
        insertLast(100);
    //    insertPos(23,size/2);
        insertMid(99);
        deleteFirst();
        view();
    }



}