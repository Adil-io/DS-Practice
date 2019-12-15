import java.util.Scanner;
class Node{
	int key;
	Node left,right;
	Node(int k)
	{
		key=k;
	}	
}
public class diameterBST{
	static Node root;
	diameterBST(){
		root=null;
	}
	static void insert(int val){
	    root=insertKey(root,val);	
	}
	static Node insertKey(Node root,int key){
		if(root==null){
			root = new Node(key);
			return root;
		}
		else if(root.key>key){
		    root.left = insertKey(root.left,key);
		}
		else if(root.key<key){
			root.right = insertKey(root.right,key);
		}
		return root;
	}
	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return;
	}
	static void printDia(Node root){
		
	}
	public static void main(String[] args){
		diameterBST tree=new diameterBST();
		insert(100);
		insert(70);
		insert(60);
		insert(65);
		insert(40);
		insert(80);
		insert(75);
		insert(90);
		insert(150);
		insert(120);
		insert(180);
		inOrder(root);
		
	}
}