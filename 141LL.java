
import java.util.*;

// The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}



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












