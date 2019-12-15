import java.util.Scanner;

class Node{
	int key;
	String val;
	Node next;
	Node(int k,String s){
		key=k;
		val=s;
	}
}
public class keyValue{
	static Node head;
	static int size;
	keyValue(){
		head=null;
		size=0;
	}
	static void insert(int k){
		System.out.println("Value is also required\n");
	}
	static void insert(String s){
		System.out.println("Key is also required\n");
	}
	static void insert(int k,String s){
		Node n=new Node(k,s);
		Node t=head;
		if(t==null){
			head=n;
			size++;
		}
		else{
			int f=0;
			while(t.next!=null){
				t=t.next;
				if(t.key==k||t.val==s){
					System.out.println("Key-Pair Already Exists\n");
					f++;
					break;
				}
	     	}
	     	if(t.next==null&&f==0){
	     		if(t.key==k||t.val==s){
					System.out.println("Key-Pair Already Exists\n");
					f++;
				}
	     	}
	        if(f==0){
	        	t.next=n;
	        	size++;	
	        }			
		}
	}
	static void view(){
		Node t=head;
		while(t!=null){
			System.out.println(t.key+" "+t.val);
			t=t.next;
		}
		System.out.println();
	}
	static void delete(int d){
		Node t=head;
		if(head.key==d){
			head=head.next;
			size--;
		}
		else{
			int f=0;
			while(t.next.key!=d){
			t=t.next;
			if(t.next==null){
		    	System.out.println("Key Not Found\n");
			    f++;
			    break;
		     }
		    }
		    if(f==0){
		    	t.next=t.next.next;
	            size--;
		    }
		}	
	}
	static void delete(String s){
		Node t=head;
		if(head.val==s){
			head=head.next;
			size--;
		}
		else{
			int f=0;
			while(t.next.val!=s){
			t=t.next;
			if(t.next==null){
		    	System.out.println("Value Not Found\n");
			    f++;
			    break;
		     }
		    }
		    if(f==0){
		    	t.next=t.next.next;
	            size--;
		    }
		}	
	}
	static void delete(int k,String s){
		Node t=head;	
		if(head.key==k&&head.val==s){
			head=head.next;
		}
		else{
			int f=0;
			while(t.next.key!=k||t.next.val!=s){
			t=t.next;
			 if(t.next==null){
			 	System.out.println("Key-Value Pair Not Found\n");
			    f++;
			    break;
			 }
		    }
		    if(f==0){
		     if(t.next.key==k&&t.next.val==s){
			 	t.next=t.next.next;
	            size--;
			 }
		     else if(t.key==k&&t.val==s){
		   		t.next=t.next.next;
	            size--;
		     }	    	 
		    }	
	    }
	}  
	static Scanner sc=new Scanner(System.in);	  
	public static void main(String[] args){
		keyValue kv=new keyValue();
		int c,f=0;
		while(f!=1){
			System.out.println("\n*********Key-Value Pair MenU**********");
			System.out.println("1.Insert Key-Value Pair \n2.Delete By Key \n3.Delete By Value \n4.Delete By Key-Value Pair \n5.View \n6.Exit");
			System.out.print("Enter your Choice : ");
			c=sc.nextInt();
			int k;String s;
			switch(c)
			{
				case 1:System.out.print("Enter Key-Value Pair to be Inserted : ");
				       k=sc.nextInt();
				       s=sc.next(); 
					   insert(k,s);
					   break;
			    case 2:System.out.print("Enter Key to be Deleted :-\n");
			    	   k=sc.nextInt();
			    	   delete(k);
			           break;
			    case 3:System.out.print("Enter Value to be Deleted :-\n");
			    	   s=sc.next();
			    	   delete(s);
			    	   break;
			    case 4:System.out.print("Enter Key-Value Pair to be Deleted :-\n");
			    	   k=sc.nextInt();
			    	   s=sc.next();
			    	   delete(k,s);
			    	   break;
			    case 5:System.out.print("Enter Key-Value Pair to be Deleted :-\n");
			    	   view();
			    	   break;		   	   
			    case 6:f=1;
			    	   System.out.print("---->Program Exiting<----");
			    	   break;
			    default:System.out.print("Invalid Input");
			}
		}	   	   
	}
}