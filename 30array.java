class Solution {
  public int maxProduct(int[] nums) {

// if (nums.length == 0) return 0;
int max_prod = nums[0];
      
      for(int i = 0 ; i < nums.length ; i++){
      int cum  = 1;
      for(int j = i; j < nums.length ; j++){
      
      cum = cum * nums[j];
      
      max_prod = Math.max(max_prod, cum);

      }
      }

return max_prod;






  }
}