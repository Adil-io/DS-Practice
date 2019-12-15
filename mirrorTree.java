import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}
public class mirrorTree{
	static Node root;
	mirrorTree(){
		root=null;
	}
	static void show(Node root){
		if(root!=null){
			show(root.left);
			System.out.print(root.data+" ");	
			show(root.right);	
		}
	}
	static boolean check(Node root){
		return checkMirror(root,root);
	}
	static boolean checkMirror(Node r1,Node r2){
		if(r1==null && r2==null){
			return true;
		}
		if(r1!=null && r2!=null && r1.data==r2.data){
			return(checkMirror(r1.left,r2.right)&&checkMirror(r1.right,r2.left));
		}
		return false;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		mirrorTree mt = new mirrorTree();
		root=new Node(3);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.right=new Node(2);
		root.right.right=new Node(1);
		System.out.println("InOrder Traversal of Tree :-");
		show(root);
		if(check(root))
			System.out.println("\n\nTree is Symmetrical i.e Mirrored");
		else
			System.out.println("\n\nTree is Asymmetrical i.e Not Mirrored");
	}
}