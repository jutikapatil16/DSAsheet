import java.util.Arrays;
class Solution {
  public boolean isAnagram(String s, String t) {

// equals for comparison 
// x = x + s.charAt(i)
// Arrays.equals(sChar, tChar)
// char[] sChar = s.toCharArray();

      int n = s.length();
      int m = t.length();
      String x = "";



// 1. (2 loop plus extra space ... naive method)
if(m !=n){
      return false;
  }

//     for(int i = 0 ; i < n ; i++){
//         for(int j =0 ; j < m ; j++){
//           if(s.charAt(i) ==t.charAt(j)){
//               x = x + s.charAt(i);
                     
//           break;
//           }

//         }
      
//     }

// if(s.equals(x)){

  
// return true;
// }

// return false;
// 2.  increment counter of char if found in first String and decrement if found in second String.
 
int [] arr = new int [26];
    
    for(int i=0;i<s.length() ;i++)
    {
      arr[s.charAt(i)-'a']+=1;
      arr[t.charAt(i)-'a']-=1;
    }
    
     for(int i=0;i<s.length();i++)
    {
  //Rather than checking for whole  arr, we simply check for S chars positions
      if(arr[s.charAt(i)-'a']!=0)return false;
    }
    
    // return true;
// 3. convert toCharArray and sort then if element at i same then return true


  char[] sChar = s.toCharArray();
  char[] tChar = t.toCharArray();
  
  Arrays.sort(sChar);
  Arrays.sort(tChar);
  
  return Arrays.equals(sChar, tChar);  
  }
}
