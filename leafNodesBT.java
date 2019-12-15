import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}
public class leafNodesBT{
	static Node root;
	leafNodesBT(){
		root=null;
	}
	static void insert(int data){
		root=insertroot(root,data);
	}
	static Node insertroot(Node root,int data){
		if(root==null){
			 root=new Node(data);
			 return root;
		}
		if(data<root.data){
			root.left=insertroot(root.left,data);
		}
        if(data>root.data){
			root.right=insertroot(root.right,data);
		}
       return root;
	}
	static void leafNodes(Node root){
		if(root!=null){
			if(root.right==null && root.left==null){	
			    System.out.print(root.data+" ");
		    }
		    else{	
			    leafNodes(root.left);
			    leafNodes(root.right);
		    }
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter no. of Nodes in Tree : ");
		int n=sc.nextInt();
		leafNodesBT l=new leafNodesBT();
		System.out.println("Enter value of Nodes in Tree:-");
		for(int i=0;i<n;i++){
			insert(sc.nextInt());
		}
		System.out.println("Leaf Nodes of Tree are :-");
		leafNodes(root);
	}
}