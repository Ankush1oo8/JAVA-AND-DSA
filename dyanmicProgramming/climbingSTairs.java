package dyanmicProgramming;

import java.util.*;

public class climbingSTairs {
    public static int stairsClimb(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = stairsClimb(n - 1, ways) + stairsClimb(n - 2, ways);
        return ways[n];
    }
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(stairsClimb(n, ways));
        System.out.println(tabulation(n));
    }
}
