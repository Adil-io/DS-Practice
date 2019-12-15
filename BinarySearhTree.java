import java.util.Scanner;

public class BinarySearhTree{
	class Node{
		int key;
		Node left,right;
		Node(){}
	}
	Node root;
	BinarySearhTree(){
		root=null;
	}
	void insert(int k){
		root=insertKey(root,k);
	}
	Node insertKey(Node root,int k){
		if(root==null){
			root=new Node();
			root.key=k;
			return root;
		}
		else if(k<root.key){
			root.left=insertKey(root.left,k);
		}
		else if(k>root.key){
			root.right=insertKey(root.right,k);
		}
		return root;
	}
	Node delKey(Node root,int k){	
		if(root.key==k){
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			else{
				root.key=findMin(root.right);
				root.right=delKey(root.right,root.key);
			}
		}
		else if(k<root.key){
			root.left=delKey(root.left,k);
		}
		else if(k>root.key){
			root.right=delKey(root.right,k);
		}
		else{
			System.out.println("Element "+k+" NotFound");
			return root;
		}
		return root;
	}
	int findMin(Node root){
		Node min=root;
		while(min.left!=null){
			min=min.left;
		}
		return min.key;
	}
	int findMax(Node root){
		Node max=root;
		while(max.right!=null){
			max=max.right;
		}
		return max.key;
	}
	void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
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
	int height(Node root){
		if(root==null)
			return 0;
		else{
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh>rh)
				return lh+1;
			else
				return rh+1;
		}	
	}
	void level(Node root){
		int h=height(root);
		for(int i=0;i<h;i++){
			System.out.print("\nLevel "+i+":");
			levelTraversal(root,i);
		}
	}
	void levelTraversal(Node root,int i){
		if(root!=null){
			if(i==0)
				System.out.print(root.key+" ");
			else{
				levelTraversal(root.left,i-1);
				levelTraversal(root.right,i-1);
			}	
		}
	}
	void spiral(Node root){
		int h=height(root);
		boolean b=false;
		for(int i=0;i<h;i++){
			System.out.print("\nLevel "+i+":");
			printSpiral(root,i,b);
			b=!b;	
		}
	}
	void printSpiral(Node root,int i,boolean b){
		if(root!=null){
			if(i==0)
				System.out.print(root.key+" ");
			else if(b){
			    printSpiral(root.right,i-1,b);
			    printSpiral(root.left,i-1,b);
		    }
		    else{
			    printSpiral(root.left,i-1,b);
			    printSpiral(root.right,i-1,b);
		    }	
		}		
	}
	void search(Node root,int s,int l){
		if(root==null){
			System.out.println("Element "+s+" Not Found");
		}
		else{
			if(s==root.key){
				System.out.println("Element "+s+" Found at Level "+l);
			}
			else if(s<root.key){
				l++;
				search(root.left,s,l);
			}			
			else if(s>root.key){
				l++;
				search(root.right,s,l);
			}			
		}
	}
/*	void kMin(){
		
	}
	void kMax(){
		
	} */
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		BinarySearhTree t=new BinarySearhTree();
		int n=sc.nextInt();
		while(n-->0){
			t.insert(sc.nextInt());
		}
		System.out.println("PostOrder Traversal");
		t.postOrder(t.root);
		System.out.println("\nMin = "+t.findMin(t.root));
		System.out.println("Max = "+t.findMax(t.root));
		System.out.print("Enter key to be Deleted : ");
		int d=sc.nextInt();
		t.delKey(t.root,d);
		System.out.println("InOrder Traversal");
		t.inOrder(t.root);
		System.out.println("\nheight = "+t.height(t.root));
		System.out.print("Level Traversal");
		t.level(t.root);	
		System.out.print("\nSpiral Traversal");	
		t.spiral(t.root);	
		System.out.print("\nEnter key to be Searched : ");	
		int s=sc.nextInt();
		t.search(t.root,s,0);	
	}
}