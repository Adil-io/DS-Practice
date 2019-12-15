package com;



import java.util.Scanner;



class Node3 {



int data;

Node3 prev;

Node3 next;



Node3(int d) {

data = d;

next = null;

prev = null;

}

}

public class Q6 {

static Node3 head,tail;

static int size;



Q6(){

    size=0;

	head=null;

}

static void insertFirst(int d)

{

	Node3 n=new Node3(d);

	if(head==null)

	{

		head=n;

		tail=n;

	}

	else

	{

		tail.next=n;

		n.next=head;

		head.prev=n;

		n.prev=null;

		head=n;

	}

	size++;

}

static void insertLast(int d)

{

	Node3 n=new Node3(d);

	Node3 t=head;

	if(t==null)

	{

		head=n;

		tail=n;

	}
	else{

	while(t!=tail)

	{

		t=t.next;

	}

	t.next=n;

	n.prev=t;

	n.next=head;

	tail=n;

	
	}
	size++;

}

static void insertIndex(int p,int d)

{

	if(p==0)

	{

		insertFirst(d);

	}

	else if(p==size)

	{

		insertLast(d);

	}

	else if(p>=size+1||p<0)

	{

		System.out.println("Invaild Index");

	}

	else

	{

		Node3 t=head,c=t.next;

		Node3 n=new Node3(d);

		for(int i=1;i<p;i++)

			{t=t.next;}

		

		n.next=t.next;

		n.prev=t;

		t.next=n;

		c.prev=n;

		size++;

	}

}

static void delFirst()

{

	head=head.next;

	tail.next=head;

	size--;

}

static void delLast()

{

	tail=tail.prev;

	tail.next=head;

	size--;

}

static void delPos(int p)

{

	if(p==1)

	{

		delFirst();

	}

	else if(p==size)

	{

		delLast();

	}

	else if(p>=size+1||p<1)

	{

		System.out.println("Invaild Position");

	}

	else

	{

		int f=0;

		Node3 t=head,c=null;

		for(int i=1;i<p-1;i++)

		{

			t=t.next;

			c=t.next.next;

			f++;

		}

		if(f==0)

		{

			c=t.next.next;

		}

		t.next=c;

		c.prev=t;

		

		size--;

	}

}

static void view()

{

	Node3 t=head;

	while(t!=tail)

	{

		System.out.print(t.data+" ");

		t=t.next;

	}

	System.out.print(t.data);

}

static void viewRev()

{

	System.out.println();

	Node3 t=tail;

	while(t!=head)

	{

		System.out.print(t.data+" ");

		t=t.prev;

	}

	System.out.print(t.data);

}

public static void main(String args[])

{

	Scanner sc=new Scanner(System.in);

	Q6 dl=new Q6();

	

	System.out.println("Doubly Linked List :");

	System.out.println("1. Insert at first");

	System.out.println("2. Insert at last");

	System.out.println("3. Insert by position");

	System.out.println("4. Delete first");

	System.out.println("5. Delete last");

	System.out.println("6. Delete by index");

	System.out.println("7. Display forward");

	System.out.println("8. Display backward");



	System.out.println("Enter your Choice");



	int ch;

	ch=sc.nextInt();

	

	switch(ch)

	{

	case 1:

	{

		System.out.println("Enter the element to be inserted");

		int data=sc.nextInt();

		dl.insertFirst(data);

		

		break;

	}

	case 2:

	{

		System.out.println("Enter the element to be inserted");

		int data=sc.nextInt();

		dl.insertLast(data);

		

		break;

	}

	case 3:

	{

		System.out.println("Enter the element to be inserted");

		int data=sc.nextInt();

		System.out.println("Enter the position");

		int pos=sc.nextInt();

		dl.insertIndex(pos, data);

		

		break;

	}

	case 4:

	{

		dl.delFirst();

		break;

	}

	case 5:

	{

		dl.delLast();

		break;

	}

	case 6:

	{

		System.out.println("Enter index to be deleted");

		int pos=sc.nextInt();

		dl.delPos(pos);

		

		break;

	}

	case 7:

	{

		System.out.println("Forward Linked List:"+head.data);

		dl.view();

		

		break;

	}

	case 8:

	{

		System.out.println("Backward Linked List:");

		dl.viewRev();
		break;

	}

	default:

	{

		System.out.println("Invalid Option");

		break;

	}

	}

	System.out.println("Exit:  Yes(Y) / No(N)");

	char choice=sc.next().charAt(0);

	switch(choice)

	{

	case 'Y':

	{

		System.out.println("Succesfully Exit");

		break;

	}

	case 'N':

	{

		Q6 mf=new Q6();

		mf.main(args);

		break;

	}

	}

}

}