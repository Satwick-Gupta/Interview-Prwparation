public class coinchangemaxnoofwaysDP {
    public static void main(String[] args) {
        int coins[]={1,2,3};
        int W=4;
        int dp[][]=new int[coins.length+1][W+1];
        for(int i=0;i<coins.length+1;i++)
        {
            dp[i][0]=1;
        }
        for(int j=1;j<W+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<coins.length+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[coins.length][W]);


    }
}
