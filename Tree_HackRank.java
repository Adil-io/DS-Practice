import java.util.Scanner;

class Node{
	Node left,right;
	public int data;
	public Node(){
	//	data=0;
	    left=right=null;
	}
	public Node(int data){
		this.data=data;
	}
	
	public void insert(int val){
		if(val<=data){
			if(left==null)
				left = new Node(val);
			else
				left.insert(val);
		}
		else{
			if(right==null)
				right = new Node(val);
			else
				right.insert(val);
		}
	}
	
	public boolean contains(int val){
		if(val==data){
			return true;
		}
		else if(val<data){
			if(left==null)
				return false;
			else
				return left.contains(val);
		}
		else{
			if(right==null)
				return false;
			else
				return right.contains(val);	
		}
	}
	
	public void printInOrder(){
		if(left!=null){
			left.printInOrder();
		}
		System.out.print(data+" ");
		if(right!=null){
			right.printInOrder();
		}
	} 
		
	public void printPreOrder(){
		System.out.print(data+" ");
		if(left!=null){
			left.printPreOrder();
		}
		if(right!=null){
			right.printPreOrder();
		}
	}
	
	public void printPostOrder(){
		if(left!=null){
			left.printPostOrder();
		}
		if(right!=null){
			right.printPostOrder();
		}
		System.out.print(data+" ");
	}	
}



public class Tree_HackRank{
	
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		Node tree=new Node();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		System.out.println("Tree InOrder :");
		tree.printInOrder();
		System.out.println("\nTree PreOrder :");
		tree.printPreOrder();
		System.out.println("\nTree PostOrder :");
		tree.printPostOrder();
		System.out.println("\nEnter an Element to be Searched in the Tree :");
		int e=sc.nextInt();
		if(tree.contains(e))
			System.out.println(e+" is found in the Tree");
		else
			System.out.println(e+" is not found in the Tree");	
			
	}
}