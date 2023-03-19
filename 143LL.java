
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Remove_Duplicate_From_LL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	/* Drier program to test above functions */
	public static void main(String args[])
    {
       
        
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}

// } Driver Code Ends


/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        
    if (head == null) {
        
            return null;
        }
        



// USING HASHSET when we are to compare (that's why store in hashmap) and do an action/ operation  on it 
HashSet<Integer> abc = new HashSet<>();
Node tempNode = head;

abc.add(tempNode.data);

//  1. first sort using swapping 
//  2. if current.data == current.next.data then 
//   current.next = current.next.next;

// int temp = 0;

// Node prehead = tempNode;
// Node curr = prehead;


// while(tempNode.next != null){
//   if(tempNode.next.data > tempNode.next.next.data){
//       temp = tempNode.next.data;
//       tempNode.next = tempNode.next.next;
//   } 
// }


while(tempNode.next != null){
  if(!abc.contains(tempNode.next.data)){
      abc.add(tempNode.next.data);

      tempNode = tempNode.next;
  }else{
      tempNode.next = tempNode.next.next;
  }
}


// while(curr.next != null){
//   if(curr.next.data == curr.next.next.data){
//       curr.next = curr.next.next;
//   }else{
//       curr = curr.next;
//   }
// }


return head;

    }
}











