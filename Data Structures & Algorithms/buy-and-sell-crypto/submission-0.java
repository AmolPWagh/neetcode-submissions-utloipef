class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0];
        int min = prices[0];
        int temp=0;
        int res=0;

        for (int i=1; i<prices.length; i++){
            
            if(min>prices[i]){
                min = prices[i];
                max = min;
            }
            if (max<prices[i]){
                max = prices[i];
                temp = max-min;
            }
            res = Math.max(res,temp);

        }
        return res;
    }
}
