// Java program to find middle of linked list
class LinkedList
{
	Node head; // head of linked list

	/* Linked list node */
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to print middle of linked list */
	void printMiddle()
	{
		Node a = head;
		Node b = head;
		int c=1;
		
		while(c<3){
		   b=b.next;
		   c++;
		   
		}
		
		while(b.next!=null){
		    a=a.next;
		    b=b.next;
		    
		}
		System.out.print(a.data);	
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		if(head==null){
		  		head = new_node;  
		}
		
		else{
		    	Node tnode = head;
		while (tnode.next != null)
		{
			
			tnode = tnode.next;
		}
		  tnode.next=new_node;
		  
		}
	//	new_node.next = head;

		/* 4. Move the head to point to new Node */
	//	head = new_node;
	}

	/* This function prints contents of linked list
	starting from the given node */
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+"->");
			tnode = tnode.next;
		}
		System.out.print("\n");
	//	System.out.println("NULL");
	}

	public static void main(String [] args)
	{
		LinkedList llist = new LinkedList();
		for (int i=1; i<=7; i++)
		{
			llist.push(i);
			llist.printList();
		//	llist.printMiddle();
		}
		llist.printMiddle();
	}
}
// This code is contributed by Rajat Mishra
