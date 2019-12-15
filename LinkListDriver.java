import java.util.Scanner;

class Node{
    int data;
    Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
  	public void setData(int d)   
  	{
  		data=d;
  	}
  	public void setNext(Node n)   //Setter
  	{
  		next=n;
  	}
  	public int getData()
  	{
  		return(data);
  	}
  	public Node getNext()        //Getter
  	{
  		return(next);
  	}
}

public class LinkListDriver{
    int size;
    public Node head;
	public LinkListDriver()
	{
		size=0;
		head=null;
	}
	public void insertAtFirst(int val)
	{
		Node n;
		n=new Node();
		n.setData(val);
		n.setNext(head);
		head=n;
		size++;
	}
	public void insertAtLast(int val)
	{
		Node n,t;
		n=new Node();
		n.setData(val);
		t=head;
		if(t==null)
			head=n;
		else
		{
			while(t.getNext()!=null)
			{
				t=t.getNext();
			}
			t.setNext(n);
		}
		size++;				
	}
	public void insertAtPos(int val,int pos)
	{
		if(pos==1)
			insertAtFirst(val);
		else if(pos==size+1)
			insertAtLast(val);
		else if(pos>1 && pos<=size)
		{
			Node n,t;
			n=new Node(val,null);
			t=head;
			for(int i=1;i<pos-1;i++)
			{
				t=t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("Insertion not possible at "+pos);		
	}
	public void deleteFirst()
	{
		if(head==null)
			System.out.println("List is already Empty");
		else
		{
			head=head.getNext();
			size--;
		}	
	}
	public void deleteLast()
	{
		if(head==null)
			System.out.println("List is already Empty");
		else if(size==1)
		{
			head=null;
			size--;
		}
		else
		{
			Node t;
			t=head;
			for(int i=1;i<size-1;i++)
			{
				t=t.getNext();
			}
			t.setNext(null);
			size--;
		}	
	}
	public void deleteAtPos(int pos)
	{
		if(head==null)
			System.out.println("List is already Empty");
		else if(pos<1 || pos>size)
			System.out.println("Invalid Position");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else
		{
			Node t,t1;
			t=head;
			for(int i=1;i<pos-1;i++)
			{
				t=t.getNext();
			}
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
		}				
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;	
	}
	public int getListSize()
	{
		return size;
	}
	public void viewList()
	{
		Node t;
		if(isEmpty()==true)
			System.out.println("List is Empty");
		else
		{
			t=head;
			for(int i=1;i<=size;i++)
			{
				System.out.print(t.getData()+" ");
				t=t.getNext();
			}
		}	
	}
	static Node revLL(Node head){
		if(head==null){
			return head;
		}
		else{
			revLL(head.next);
			System.out.print(head.data+" ");
		}
	return head;
   }
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkListDriver list=new LinkListDriver();
		boolean flag=true;
		while(flag)
		{
			System.out.println();
		    System.out.println("1. Add Item to the List at Start");
		    System.out.println("2. Add Item to the List at Last");
	     	System.out.println("3. Add Item to the List at Position");
	  	    System.out.println("4. Delte First Item from the List");
	    	System.out.println("5. Delte Last Item from the List");
	    	System.out.println("6. Delte First Item from the List at a Position");
	    	System.out.println("7. View List");
	    	System.out.println("8. Reverse LinkedList");
	    	System.out.println("9. Exit");
	     	System.out.print("Enter your Choice : ");
	    	int choice=sc.nextInt();
	    	int p,v;
	    	switch(choice)
	    	{
		    	case 1:
		    		   System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               list.insertAtFirst(v);
		               break;
	       	    case 2:
	       	    	   System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               list.insertAtLast(v);
		               break;
		        case 3:
		        	   System.out.print("Enter Position : ");
		               p=sc.nextInt();
		               System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               list.insertAtPos(v,p);
		               break;
	     	    case 4:
	     	    	   list.deleteFirst();
		               break;
		        case 5:
		        	   list.deleteLast();
		               break;
		        case 6:
		        	   System.out.print("Enter Position : ");
		               p=sc.nextInt();
		               list.deleteAtPos(p);
		               break;
		        case 7:
		        	   list.viewList();
		               break;
		        case 8:
		        	   list.revLL(list.head);
		               break;       
		        case 9:
		        	   flag=false;
		        	   System.out.print("Program Exiting");
		               break;
		        default:
		        	   System.out.print("Invalid choice");	
	    	}	
		}		
			
	}
}