class Solution {
  public int maxSubArray(int[] nums) {


//1. kadane's
//2.  link - https://www.youtube.com/watch?v=HCL4_bOd3-4

      int n = nums.length;
      int max_sum = Integer.MIN_VALUE;
      int curr_sum =0;

for(int i = 0 ; i < n ; i++){
     
curr_sum = nums[i] + curr_sum;
      
       if( curr_sum > max_sum ){
          max_sum = curr_sum ;
      }
      if (curr_sum < 0){
              curr_sum = 0;
      }

}


// 3. brute force
     
  // for(int i = 0 ; i < n ; i++){
     
  //     sum = nums[i] + sum;
      
  //     for(int j =0 ; i <n ; j ++){
  //        if( sum > max ){
  //         max = sum ;
  //     }
  //     }

  //    }    


return max_sum;
}
}
