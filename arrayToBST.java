import java.util.Scanner;

public class arrayToBST{
	class Node{
		int key;
		Node left,right;
		Node(){}
	}
	class BST{
		Node root;
		BST(){
			root=null;
		}
		Node preInsert(int[] arr,int start,int end){
			if(start>end){
				return null;
			}
			Node root=new Node();
			root.key=arr[start];
			int i;
			for(i=start;i<=end;i++){
				if(arr[i]>root.key){
					break;
				}
			}
			root.left=preInsert(arr,start+1,i-1);
			root.right=preInsert(arr,i,end);
			return root;	
		}
		Node postInsert(int[] arr,int start,int end){
			if(start>end){
				return null;
			}
			Node root=new Node();
			root.key=arr[end];
			int i;
			for(i=end;i>=start;i--){
				if(arr[i]<root.key){
					break;
				}
			}
			root.right=postInsert(arr,i+1,end-1);
			root.left=postInsert(arr,start,i);
			return root;
		}
		void postOrder(Node root){
			if(root!=null){
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.key+" ");
			}
		}
		void preOrder(Node root){
			if(root!=null){
				System.out.print(root.key+" ");
				preOrder(root.left);
				preOrder(root.right);
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		arrayToBST bst=new arrayToBST();
		arrayToBST.BST tree=bst.new BST();
		System.out.print("Enter size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array in PreOrder :-");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		tree.root=tree.preInsert(arr,0,n-1);
		tree.postOrder(tree.root);
		System.out.println("\nEnter Array in PostOrder :-");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		tree.root=tree.postInsert(arr,0,n-1);
		tree.preOrder(tree.root);
	}
}