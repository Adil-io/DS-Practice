import java.util.Scanner;

public class inOrderToBST{	
	static class Node{
		int key;
		Node left,right;
		Node(int d){
			key=d;
		}
	}
	static class Tree{
		Node root;
		Tree(){
			root=null;
		}
		Node insert(int[] arr,int l,int r,Node root){
			if(l<=r){
				int m=l+(r-l)/2;
				root=new Node(arr[m]);
				root.left=insert(arr,l,m-1,root.left);
				root.right=insert(arr,m+1,r,root.right);
			}
			return root;
		}
		void preOrder(Node root){
			if(root!=null){
				System.out.print(root.key+" ");
				preOrder(root.left);
				preOrder(root.right);
			}
		}
		void postOrder(Node root){
			if(root!=null){
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.key+" ");
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		Tree tree=new Tree();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		tree.root=tree.insert(arr,0,n-1,tree.root);
		System.out.println("PreOrder :-");
		tree.preOrder(tree.root);
		System.out.println("\nPostOrder :-");
		tree.postOrder(tree.root);
	}
}