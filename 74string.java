class Solution {
  public int firstUniqChar(String s) {
     int n = s.length();
     
     for(int i = 0 ; i <n ; i ++){
        String k = "";
        k = k + s.charAt(i);
        String sub = s.substring(i+1, n) + s.substring(0,i);
        if(!sub.contains(k)){
            return i;
        }
     }

     return -1;
  }
}