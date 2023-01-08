
import java.util.Arrays;
class Solution{
  public static int kthSmallest(int[] arr, int l, int r, int k) 
  { 
      Arrays.sort(arr);
      // 3,4,7,10,15,20
      return arr[k-1];
  
  } 
}

