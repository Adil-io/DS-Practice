import java.util.Scanner;

class Node{
	int key;
	Node left,right;
	Node(int k)
	{
		key=k;
	}
}
public class traversalBST{
	
	static Node root;
	traversalBST(){
		root=null;
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
	
	static void constructBSTpost(int arr[],int n){
		
			if(root==null){
				root = new Node(arr[n-1]);
			}
			for(int i=0;i<n;i++){
			 if(arr[i]<root.key){
				root.left=insertKey(root.left,arr[i]);
			}
			else if(arr[i]>root.key){
				root.right=insertKey(root.right,arr[i]);
			}
		}
	}
	
	static void constructBSTpre(int arr[],int n){
		for(int i=0;i<n;i++){
			if(root==null){
				root = new Node(arr[i]);
			}
			else if(arr[i]<root.key){
				root.left=insertKey(root.left,arr[i]);
			}
			else if(arr[i]>root.key){
				root.right=insertKey(root.right,arr[i]);
			}
		}
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
    static int x;
	static void highLevelkey(Node root){
		h=height(root);
		if(x<=h){
			System.out.print(x+" : ");
		traversal(root,x);
		}
		else{
			System.out.print("Doesnt Exist in BST");
		}
	}	
	static void traversal(Node root,int i){	
		if(root==null){
			return ;
		}
		else if(i==1){
			System.out.print(root.key+" ");
		}
		else if(i>1){
			traversal(root.left,i-1);
			traversal(root.right,i-1);
		}
	}	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		traversalBST tree = new traversalBST();
		int c,f=0;
		System.out.println("**********BST MenU**********");
		System.out.println("1.Enter Elements in preOrder \n2.Enter Elements in postOrder");
		System.out.print("\nEnter your Choice : ");
		int e=sc.nextInt();
		System.out.print("Enter number of Elements : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
	    if(e==1){
	    	System.out.println("Enter Elements in preOrder : ");
		    for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		   }
		constructBSTpre(arr,n);
	    }
		else if(e==2){
			System.out.println("Enter Elements in postOrder : ");
		    for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		   }
		constructBSTpost(arr,n);
		} 
		while(f!=1){
			System.out.println("\n**********BST Traversal MenU**********");
			System.out.println("1.InOrder Traversal \n2.PostOrder Traversal \n3.PreOrder Traversal \n4.Exit");
			System.out.print("Enter your Choice : ");
			c=sc.nextInt();
			switch(c)
			{
			    case 1:System.out.print("InOrder Traversal :-\n");
			    	   inOrder(root);
			           break;
			    case 2:System.out.print("PostOrder Traversal :-\n");
			    	   postOrder(root);
			    	   break;
			    case 3:System.out.print("PreOrder Traversal :-\n");
			    	   preOrder(root);
			           break;
			    case 4:int x=sc.nextInt();
			           highLevelkey(root); 
			           break;             
			    case 5:f=1;
			           System.out.println("----->Program Exiting<-----");
			           break;
			    default:System.out.println("\nInvalid Input");
			            break;                                  	   
			}
			
		}	
	}
}