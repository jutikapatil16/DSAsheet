class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> result = new ArrayList<>();

      HashMap<String , List <String>> map = new HashMap<>();

      for( String str : strs){
          // ["eat","tea","tan","ate","nat","bat"] 
          // str is ""eat"" 
          // converting to char [e,a,t] 
            char[] chararr = str.toCharArray();
          // then sort [a,e,t] then again to string "aet"
            Arrays.sort(chararr);
            String key = new String(chararr); // aet

if(map.containsKey(key)){
  map.get(key).add(str);
  // aet --> ["eat" , "tea"]

}else{
  List<String> strlist= new ArrayList<>();
  //  aet --> []
  strlist.add(str);

  map.put(key,strlist);
  // aet --> ["eat"]
}
      }

result.addAll(map.values());
return result;
      
  }
}