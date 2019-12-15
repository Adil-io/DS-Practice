import java.util.Scanner;

class Node{
	int key;
	Node left,right;
	Node(int d)
	{
		key=d;
	}	
}
public class BinarySearchTree{
	
	static Node root;
	BinarySearchTree(){
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
	static void search(int key){
		 searchKey(root,key);	
	}
	static int l=0;
	static void searchKey(Node root,int key){
		if(root==null){
			System.out.println("Element "+key+" Not Found");
		}
		else if(root.key==key){
			System.out.println("Element "+key+" Found at Level "+l);
			l=0;
		}
		else if(root.key>key){
			l++;
			searchKey(root.left,key);
		}
		else{
			l++;
			searchKey(root.right,key);
		}
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
	static void highLevelkey(Node root){
		h=height(root);
		System.out.print(h-1+" : ");
		traversal(root,h);
	}	
	static void printLevel(Node root){
		h=height(root);
		for(int i=1;i<=h;i++){
			System.out.print("\nLeveL-"+(i-1)+": ");
			traversal(root,i);
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
	static int k;
	static int ki=0;
	static boolean flagMin=false;
	static void kMin(Node root){
		if(root!=null){
				kMin(root.left);
				ki++;
				if(ki==k){
				System.out.print(root.key);
				flagMin=true;
				}
				kMin(root.right);
		}
	}
	static int kj=0;
	static boolean flagMax=false;
	static void kMax(Node root){
		if(root!=null){
				kMax(root.right);
				kj++;
				if(kj==k){
				System.out.print(root.key);
				flagMax=true;
				}
				kMax(root.left);
		}
	}	
   	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		int c,f=0;
		while(f!=1){
			System.out.println("\n\n**********BST MenU**********");
			System.out.println("1.Insert in BST \n2.InOrder Traversal \n3.PostOrder Traversal \n4.PreOrder Traversal \n5.LeveL Traversal \n6.Delete Node \n7.Min Key \n8.Max Key \n9.Height \n10.Search \n11.Elements at highest level \n12.Kth Max & Min \n13.Exit");
			System.out.print("Enter your Choice : ");
			c=sc.nextInt();
			switch(c)
			{
				case 1:System.out.print("Enter Key to be Inserted : ");
				       int d=sc.nextInt();
					   insert(d);
					   break;
			    case 2:System.out.print("InOrder Traversal :-\n");
			    	   inOrder(root);
			           break;
			    case 3:System.out.print("PostOrder Traversal :-\n");
			    	   postOrder(root);
			    	   break;
			    case 4:System.out.print("PreOrder Traversal :-\n");
			    	   preOrder(root);
			           break;
			    case 5:System.out.print("LeveL Traversal :-");
			    	   printLevel(root);
			           break;       
			    case 6:System.out.print("Enter Key to be Deleted from BST : ");
			           int r=sc.nextInt();
			           deleteNode(root,r);
			           break;       
			    case 7:System.out.println("Min Key in BST is "+findMin(root));
			           break;
			    case 8:System.out.println("Max Key in BST is "+findMax(root));
			           break;
			    case 9:System.out.println("Height of BST is "+height(root));
			           break;
			    case 10:System.out.print("Enter Key to be Searched : ");
			           int v=sc.nextInt();
			           search(v);
			    	   break;
			    case 11:System.out.print("Elements at Highest Level ");
			    	    highLevelkey(root);
			    	    break;
			    case 12:System.out.println("Enter K :");
	                 	k=sc.nextInt();
                 		kMin(root);
                		if(flagMin==true){
             		    	System.out.println(" = "+k+"-Min");
                		}
                        else{
                            System.out.println("k Does not exist in BST");
                        }
                        kMax(root);
                        if(flagMin==true){
			                System.out.println(" = "+k+"-Max");
		                }
                        else{
                           System.out.println("k Does not exist in BST");
                        }	 
                        break;	    
			    case 13:f=1;
			           System.out.println("----->Program Exiting<-----");
			           break;
			    default:System.out.println("\nInvalid Input");
			            break;                                  	         
			}
		}
		
		
	}
}