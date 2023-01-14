class Solution {
  public boolean isPalindrome(String s) {
      s= s.toLowerCase();
      s= s.replaceAll("[^a-z^0-9]+","");
      int n = s.length() ;
      int i = 0;
      while(i < n/2){
      if(s.charAt(i) != s.charAt(n-i-1)){
       return false;    
      }
      i++;
      }
      return true;
    
  }
}


