import java.util.Scanner;

class Node{
	int key;
	Node left,right;
	Node(int k){
		key=k;
		left=right=null;
	}
}
public class checkBST{
	static Node root;
	checkBST(){
		root=null;
	}
	
	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return;
	}
	static boolean checkBSTree(Node root){
		if(root.left!=null || root.right!=null){
			if(root.key<root.left.key){
				return false;
			}
			else if(root.key>root.right.key){
				return false;
			}
			else{
				checkBSTree(root.left);
				checkBSTree(root.right);
			}
		}
		return true;
	}
	public static void main(String[] args){
		checkBST tree=new checkBST();
		tree.root = new Node(40);
		tree.root.left = new Node(20);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(30);
		System.out.println("Inorder Traversal of Binary Tree :-");
		inOrder(root);
		if(checkBSTree(root)){
			System.out.println("\nBinary Tree satisfies Binary Search Tree properties");
		}
		else{
			System.out.println("\nBinary Tree doesn't satisfies Binary Search Tree properties");
		}
		
	}
}