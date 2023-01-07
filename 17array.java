// BASICALLY BINARY SEARCH 


class Solution {
  public int search(int[] nums, int target) {
          int i=0;
          if(target==nums[i]){
              return 0;
          }
          if(target<nums[i]){
              i=nums.length-1;
              while(i>=0){
                  if(nums[i]==target){
                      return i;
                  }if(nums[i]<target){
                      return -1;
                  }
                  i--;
              }
          }
          i = 0;
          if(target>nums[i]){
              while(i<nums.length){
                  if(nums[i]==target){
                      return i;
                  }if(nums[i]>target){
                      return -1;
                  }
                  i++;
              }
              
          }
          return -1;
      }
  
      
  //     public int search(int[] nums, int target) {
  //     int n = nums.length;
  //     int k = 3;
  //     Arrays.sort(nums);
  //        for (int i = 0 ; i < n ; i++ ){
  //          if(nums[i] == target){
  //             return n - k + i;
  //          }else{
  //             return -1;
  //          }
  //        }
  //    return 0; 
  // }
  }
  
  // 1.  k =3
  // 4 ,5 ,6 ,7 ,0 ,1 ,2
  // 0 ,1 ,2 ,3 ,4 ,5 ,6
  // nums[i] = target 
  // n - k + i
  // 7 - 3 + 0 = 4
  
  //2.  k = 5 
  // 6,7,0,1,2,4,5
  // 0,1,2,4,5,6,7
  //  7 - 5 +  = 5
  


