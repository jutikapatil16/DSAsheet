import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {

        // ***Algorithm***
        //1. min 
        //2. min ka difference with every element 
        //3. that element will be max
        //4. maximum diff ( profit ) will be final profit


        int min = Integer.MAX_VALUE; // we cant set it to zero because min is more than 0 so can't change it
        int max = 0;
        int overall_profit = 0;
        int current_profit=0;
        for(int i=0; i < prices.length ; i++){
           if(prices[i] < min){
            min = prices[i] ; // 7  // 1
           }
           
           if (prices[i] > max){
            max = prices[i]; //7  //7             
           }

        //    current_profit = max - min;  //7-7 = 0    // 7-1 =6     
        // therefore
            current_profit = prices[i] - min;
           if (current_profit > overall_profit){
            overall_profit = current_profit;
           }
           
        }

    return overall_profit;

    }
}