import java.util.Scanner;

class Node{
	int key;
	Node left,right;
	Node(int temp){
		key=temp;
		left = right = null;
	}
}

public class BinaryTree{
	
	static Node root;
	
	BinaryTree(){
		root=null;
	}
	
	BinaryTree(int data){
		root = new Node(data);
	}
	
	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return;
	}
	static void preOrder(Node root){
		if(root!=null){
		    System.out.print(root.key+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		return;
	}
	static void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+" ");
		}
		return;
	}
	
	public static void main(String[] args){
		BinaryTree tree=new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.inOrder(root);
	} 
}