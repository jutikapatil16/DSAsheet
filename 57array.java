//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
static List<Integer> nextPermutation(int N, int arr[]){
 List <Integer> list = new ArrayList<>();

int i = N - 2;
//  arr = {1, 2, 3, 6, 5, 4}
// Output: {1, 2, 4, 3, 5, 6}

while(i>=0 && arr[i] >= arr[i+1]) i--;

    if(i>=0){
    int j = arr.length - 1;
    while(arr[j] <= arr[i])j--;
    // 4 not < 3

    swap(arr, i, j);  
    }
        
reverse(arr, i+1, N-1);

        // Iterate through the array
for (int t : arr) {
    // Add each element into the list
    list.add(t);
}

// Return the converted List
return list;

}

static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }  
                    //O(1)            
// 4. all after first index will be in desc so reverse whole array  
  static void reverse(int[] arr, int i, int j){
        while(i<j)
            swap(arr, i++, j--);
    }
}













