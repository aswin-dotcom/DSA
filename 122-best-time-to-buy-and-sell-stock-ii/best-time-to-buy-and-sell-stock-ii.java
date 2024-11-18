class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy >= prices[i]) {
                buy = prices[i];

            } else if(buy<prices[i]){
                sum+=(prices[i]-buy);
                System.out.println(sum);
                
                buy=prices[i];

            }
        }
        return sum;

    }
}