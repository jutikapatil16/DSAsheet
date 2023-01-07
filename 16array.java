
class Solution{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long min_diff = Integer.MAX_VALUE;
        
        Collections.sort(a);
        
        //optional
        if(n ==0 || m ==0){
                return 0;
            }
            //
        for(int i =0 ; i + m - 1 < n ; i++){
            
            if(a.get(i+m-1) - a.get(i) < min_diff){
             min_diff = a.get(i+m-1) - a.get(i);
            }
        }
        return min_diff; 
    }
}