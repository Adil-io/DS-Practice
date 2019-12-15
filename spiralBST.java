import java.util.*;

class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
	}
}
public class spiralBST{
	static Node root;
	spiralBST(){
		root=null;
	}
	static void insert(int val){
		root=insertKey(root,val);
	}
	static Node insertKey(Node root,int val){
		if(root==null){
			root=new Node(val);
			return root;
		}
		else if(val<root.key){
			root.left=insertKey(root.left,val);
		}
		else if(val>root.key){
			root.right=insertKey(root.right,val);
		}
		return root;
	}
	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return ;
	}
	static Node deleteNode(Node root,int r){
		if(root==null){
			System.out.println("\nElement "+r+" Not Found");
			return root;
		}
		else if(r<root.key){
			root.left = deleteNode(root.left,r);
		}
		else if(r>root.key){
			root.right = deleteNode(root.right,r);
		}
		else{
			if(root.left==null){
				return root.right;
			}
		    else if(root.right==null){
				return root.left;
			}
			else{
				root.key=findMin(root.right);
				root.right = deleteNode(root.right,root.key);
			}
		}
		return root;
	}
	static int h;
	static int height(Node root) 
	{ 
		if (root == null) 
		return 0; 
		else
		{ 
	    	int lh = height(root.left); 
			int rh = height(root.right); 
			if (lh > rh) 
				return(lh+1); 
			else 
				return(rh+1); 
		} 
	} 
	
	static void printSpiral(Node root){
		h=height(root);
		for(int i=1;i<=h;i++){
			traversal(root,i);
		}
	}
	static int t=0;
	static void traversal(Node root,int i){	
		if(root==null){
			return ;
		}
		else if(i==1){
			System.out.print(root.key+" ");
		}
		else if(i>1 && t%2==0){
			traversal(root.left,i-1);
			t++;
			traversal(root.right,i-1);
		}
		else if(i>1 && t%2!=0){
			traversal(root.right,i-1);
			t++;
			traversal(root.left,i-1);
		}
	}
	static int d=0;
	static ArrayList<Integer> al=new ArrayList<>();
	static void traverseAufbau(Node root,int d){
		if(root==null){
	    	return ;
		}
		else if(root!=null){
			if(d==0){
				al.add(root.key);
				traverseAufbau(root.left,d);
			}
			d++;
			if(d==1){
				traverseAufbau(root.right,d);
			}
		}
	/*	else if(root.right!=null){
			traverseAufbau(root,i+1);
			System.out.print(root.key+" ");
		}	
		else{
			System.out.print(root.key+" ");
			traverseAufbau(root,i);
	        traverseAufbau(root.left,i+1);
		}	*/
	}
	static void printAufbau(Node root){
		traverseAufbau(root,d);
	}
	static int max=0;
	static int min=0;
	static int findMin(Node root){
		if(root!=null){
			min=root.key;
			findMin(root.left);
		}
		return min;
	}
	static int findMax(Node root){
		if(root!=null){
			max=root.key;
			findMax(root.right);
		}
		return max;
	}
   	static int k;
	static int i=0;
	static boolean flagMin=false;
	static void kMin(Node root){
		if(root!=null){
				kMin(root.left);
				i++;
				if(i==k){
				System.out.print(root.key);
				flagMin=true;
				}
				kMin(root.right);
		}
	}
	static int j=0;
	static boolean flagMax=false;
	static void kMax(Node root){
		if(root!=null){
				kMax(root.right);
				j++;
				if(j==k){
				System.out.print(root.key);
				flagMax=true;
				}
				kMax(root.left);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		spiralBST tree=new spiralBST();
		insert(100);
		insert(80);
		insert(50);
		insert(90);
		insert(150); 
		insert(110);
		insert(160);
	//	insert(160);
	//	insert(155);
	//	insert(160);
		System.out.println("InOrder Traversal :");
		inOrder(root);
		System.out.println("\nSpiral Traversal :");
		printSpiral(root);
	//	System.out.println("\nHeight : "+h);
		System.out.println("\nEnter K :");
		k=sc.nextInt();
		kMin(root);
		if(flagMin==true){
			System.out.println(" = kMin");
		}
        else{
            System.out.println("k Does not exist in BST");
        }
        kMax(root);
        if(flagMin==true){
			System.out.println(" = kMax");
		}
        else{
            System.out.println("k Does not exist in BST");
        }
		
	/*	System.out.println("\nAufbau's Traversal :");
		printAufbau(root);
		for(int i:al){
			System.out.print(i+" ");
		} */
	//	System.out.println("\n\nEnter the Key to be Deleted from BST :");
	//	int r=sc.nextInt();
	//	deleteNode(root,r);
	//	System.out.println("\nInOrder Traversal after Node Deletion :");
	//	inOrder(root);
	//	System.out.println("\n\nMIN Key in Tree is "+findMin(root));
	//	System.out.println("Max Key in Tree is "+findMax(root));
	}
}