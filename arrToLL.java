import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class arrToLL{
	static Node head;
	arrToLL(){
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
	static void convertToLL(int[] arr){
		for(int i=0;i<arr.length;i++){
			insert(arr[i]);
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
		arrToLL al=new arrToLL();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		convertToLL(arr);
		view();
	}
}