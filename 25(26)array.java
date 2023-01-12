import java.util.Arrays;

class Solution {
  public int findKthLargest(int[] nums, int k) {
//1.Brute Force

      Arrays.sort(nums);
      // 1 2 3 4 5 6 
      int n = nums.length;
     for (int i = n-1 ; i > -1 ; i--){
         if(i == (n - k)){
             return nums[i];
         }
     }
  return 0;
  }
}