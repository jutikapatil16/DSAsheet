import java.util.*;

class Solution {
  public int[] nextGreaterElement(int[] arr1, int[] arr2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Stack<Integer> stack = new Stack<>();
      
      for(int i=arr2.length-1;i>=0;--i){
          while(!stack.isEmpty() && arr2[i]>=stack.peek()){
              stack.pop();
          }
          
          if(stack.isEmpty()){
              map.put(arr2[i],-1);
          }else{
              map.put(arr2[i],stack.peek());
          }
          
          stack.push(arr2[i]);
      }
      
      int []ans = new int[arr1.length];
      
      for(int i=0;i<arr1.length;++i){
          ans[i] = map.get(arr1[i]);
      }
      
      return ans;
  }
}