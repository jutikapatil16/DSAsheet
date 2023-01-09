

class Solution {

   public void nextPermutation(int[] nums) {
        
// i is first , j is second
// 1 . start from second last element and see if nums[k]<nums[k+1]

// 2 . if no Breakpoint 
// i.e array is in ***DEC ORDER*** already or it is the ***LAST PERMUTATION***, so 
      

// 3. second index > first index then swap 
      

if(nums==null || nums.length <= 1)
            return;
        
int i = nums.length - 2;
while(i>=0 && nums[i] >= nums[i+1])
    i--;

if(i>=0){
    int j = nums.length - 1;
    while(nums[j] <= nums[i])
        j--;
    
swap(nums, i, j);  
}
        
reverse(nums, i+1, nums.length-1);
}
public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }                  //O(1)            
// 4. all after first index will be in desc so reverse them  
  public void reverse(int[] nums, int i, int j){
        while(i<j)
            swap(nums, i++, j--);
    }
    }




