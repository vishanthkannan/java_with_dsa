class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max = 0;
        for(int num : prices){
            if(min > num){
                min = num;
            }

            profit = num - min;

            max = Math.max(profit,max);
        }
        return max;
    }
}
