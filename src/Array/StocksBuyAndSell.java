package Array;

public class StocksBuyAndSell {
    static int findProfit(int[] price,int start, int end){
        int n = price.length;
        int profit = 0;
        if(end <= start)
            return 0;
        for(int i=start;i<end;i++){
            for(int j=i;j<=end;j++){
                int curr_profit = price[j]-price[i]+findProfit(price,start,i-1)+
                        findProfit(price,j+1,end);
                profit=Math.max(profit,curr_profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        System.out.println(findProfit(arr,0,arr.length-1));
    }
}
