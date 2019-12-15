import java.util.Scanner;

public class linkedListPalindrome 
{
      Node head;
	 
      static class Node
      {
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data=d;
    		next=null;
    	}
      }
    
    public static linkedListPalindrome  insert(linkedListPalindrome  l,int data)
    {
    	Node newNode = new Node(data);
    	newNode.next=null;
    	if(l.head==null)
    	{
    		l.head=newNode;
    	}
    	else
    	{
    		Node last =l.head;
    		while(last.next!=null)
    		{
    			last=last.next;
    		}
    		last.next=newNode;
    	}
    	return l;
    }

    public static boolean CheckPalindrome(linkedListPalindrome l)
    {
    	Node temp=l.head;
    	int num1=0,num2=0,count=0;
    	while(temp!=null)
    	{
    		num1=num1+temp.data*(int)Math.pow(10,count);
    		num2=num2*10+temp.data;
    		temp=temp.next;
    		count++;
    	}
    	if(num1==num2)
    		return true;
    	else
    		return false;
    }
    
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		linkedListPalindrome l=new linkedListPalindrome();
		System.out.println("Enter number of elements");
		int n=in.nextInt();
                System.out.println("Enter elements");
                for(int i=0;i<n;i++)
                {
        	int num=in.nextInt();
        	l.insert(l, num);
                }
                boolean x=CheckPalindrome(l);
                if(x==true)
        	System.out.println("Linked List is Palindrome");
                else
        	System.out.println("Linked List is Not Palindrome");
	}
}