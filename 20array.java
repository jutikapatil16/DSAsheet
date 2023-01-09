
//User function Template for Java

class Solution {
    
public void segregateElements(int arr[], int n){
    //1.   reverse(arr); //no order
    
    //2.   with a temp array order
    
    //3.   with arraylist
    

    
    int[] temp = new int[n];
    
    int j =0;
    // +ve added in new temp array
    for(int i =0 ; i < n ; i ++){
        if (arr[i] >= 0){
            temp[j] = arr[i];
            j++;
        }
    }
    

    // -ve added in same temp array j udhar se hi add
    for ( int i =0 ; i < n ; i++){
        
        if (arr[i] <0){
           temp[j] = arr[i];
           j++;
          }
        }
        
        ///temp  ka array mai transfer
        
    for(int i=0;i<n;i++){

            arr[i]=temp[i];

        }   
}
    
    
    // void reverse(int[] arr){
    //     int i =0;
    //     int n = arr.length -1;
    //     while ( i < (n / 2) ){
    //         int temp;
    //          temp =  arr[i];
    //          arr[i] = arr[n-1];
    //          arr[n-1] = temp;
    //         n --;
    //         i++;
    //     }
        
    //     Arrays.sort(arr);
    // }
    
    
}