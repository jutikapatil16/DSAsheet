 
 import java.util.ArrayList;
 import java.util.Arrays;
import java.util.List;
 
class Solution{
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0; i< nums.length-2; i++){
    //if a is duplicate, skip that value
        if(i>0 && nums[i] == nums[i-1])
            continue;
  //fixed the a, now will search for b & c from (i+1) index to (nums.length-1) index	
        int a = nums[i];
        int start = i+1, end = nums.length-1;
        while(start < end){
            int sum = a + nums[start] + nums[end];
            if(sum > 0){
                end--;
            }else if(sum < 0){
                start++;
            }else{
      result.add(Arrays.asList(a,nums[start],nums[end]));
      //if b value is duplicate skip that
                while(start< end && nums[start] == nums[start+1])
                    start++;
      //if c value is duplicate, skip that	
                while( start< end && nums[end] == nums[end-1])
                    end--;
                start++;
                end--;
            }
        }
    }
    return result;
  }
}