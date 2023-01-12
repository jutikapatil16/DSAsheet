class Solution {
  // public int[] productExceptSelf(int[] nums) {
  //     int answer[]=new int[nums.length];
  // for(int i=0;i<nums.length;i++){
  //     int prod=1;
  //     for(int j=0;j<nums.length;j++){
  //         if(j!=i)
              
  //             prod=prod*nums[j];
  //     }
  //     answer[i]=prod;
  // }
  // return answer;

  // }


  public int[] productExceptSelf(int[] nums) {

  int[] leftProduct = new int[nums.length];
  int[] rightProduct = new int[nums.length];
  
  for (int i=0,j= nums.length-1; i < nums.length; i++, j--) {
      if (i == 0) {
          leftProduct[i] = nums[i];
          //for first element in left
          rightProduct[j] = nums[j];
          //for first element in right
      }else {
          leftProduct[i] = leftProduct[i-1] * nums[i];
          // left to ith cumulative product
          rightProduct[j] = rightProduct[j+1] * nums[j];
          // right to ith cumulative product

      }
  }

  for (int i=0; i < nums.length; i++) {

      if (i == 0) {
          nums[i] = rightProduct[1];
      }else if (i == (nums.length - 1)) {
          nums[i] = leftProduct[i-1];
      }else {
          nums[i] = leftProduct[i-1] * rightProduct[i+1];
      }
  }
  return nums;
}
}
