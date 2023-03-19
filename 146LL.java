

/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2)

   {

          //add code here.

          Node h1 = l1;

          Node h2 = l2;

          long sum1=0;

          long sum2=0;

          long mod = 1000000007;

          while(h1!=null||h2!=null)

          {

              if(h1!=null)

              {
                //   we can use (A*10)%mod = (A%mod + 10%mod)%mod
                //    3*10 + 2
                  sum1 = (sum1*10+(h1.data))%mod;

                  h1=h1.next;

              }

              if(h2!=null)

              {

                  sum2 = (sum2*10+(h2.data))%mod;

                  h2 = h2.next;

              }

          }

          return ((sum1*sum2)%mod);

   }
}
