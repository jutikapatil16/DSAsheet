import java.util.*;
class Solution {
  public boolean containsDuplicate(int[] nums) {
      int n = nums.length;
      Arrays.sort(nums);
      for(int i = 0 ; i < n; i++ ){
         if(i!= n-1){
         if (nums[i] == nums[i+1]){
         return true;
         } 
         }
      } 
    return false;   
  }
}