import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}
public class LeftViewBT{
	static Node root;
	LeftViewBT(){
		root=null;
	}
	static int k=0;
	static void print(Node root,int i){
		if(root==null)
			return ;
		if(k<i){
			System.out.print(root.data+" ");
			k=i;
		}	
		print(root.left,i+1);
		print(root.right,i+1);	
	}
	static void display(){
		print(root,1);
	}
	public static void main(String[] args){
		LeftViewBT tree=new LeftViewBT();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		display();		
	}
}