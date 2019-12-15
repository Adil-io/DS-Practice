import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}
public class lowComAncestor{
	static Node root;
	lowComAncestor(){
		root=null;
	}
	static Node lcm(Node root,int x,int y){
		if(root==null){
			return root;
		}
		if(root.data==x || root.data==y){
			return root;
		}
		Node l=lcm(root.left,x,y);
		Node r=lcm(root.right,x,y);
		if(l!=null && r!=null){
			return root;
		}
		if(l!=null)
			return l;
		else
			return r;	
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		lowComAncestor tree = new lowComAncestor();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("Enter Nodes(any two) to Find LOWEST COMMON ANCESTOR");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Node lowAnc = lcm(root,x,y);
		System.out.println("LCA("+x+","+y+") = "+lowAnc.data);
	}
}