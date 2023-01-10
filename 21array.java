 // ALGORIHTM
        //1.  Arrays.sort(a); O(n(logn))
        
        //2. Brute force ( count 0 's 1s and 2s in sepearte variables')  O(2n)
       
       
       // 3. Anything after low pointer should be 0 and 
       //    anything after high pointer should be 2
       //    as soon as mid crosses the high STOP
class Solution{
  public static void main(int[] a, int n) {
    int low =0;
  int mid =0;
  int high =n-1;

  while(mid <= high ){ // as soon as mid crosses the high STOP
  if (a[mid] == 1 ) {
      mid++;
  }
  else if(a[mid] == 0){
     int temp =   a[low];
     a[low] = a[mid];
     a[mid] = temp;   
     low++;
     mid++;
      
  }
  else{
      int temp =   a[high];
     a[high] = a[mid];
     a[mid] = temp; 
      high--;
  }

  }
  }
  

}        
       