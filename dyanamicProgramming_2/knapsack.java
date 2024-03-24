package dyanamicProgramming_2;

public class knapsack {

    public static int knapsackRec(int val[], int wt[], int n, int W) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // include
            int ans1 = val[n - 1] + knapsackRec(val, wt, n - 1, W - wt[n - 1]);
            // exclude
            int ans2 = knapsackRec(val, wt, n - 1, W);

            return Math.max(ans1, ans2);
        } else {
            // not valid
            return knapsackRec(val, wt, n - 1, W);
        }
    }

    // memoization
    public static int knapsackMemo(int val[], int wt[], int n, int W, int dp[][]) {
        if (W <= 0 || n <= 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            // include
            int ans1 = val[n - 1] + knapsackMemo(val, wt, n - 1, W - wt[n - 1], dp);
            // exclude
            int ans2 = knapsackMemo(val, wt, n - 1, W, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // not valid
            dp[n][W] = knapsackMemo(val, wt, n - 1, W, dp);
            return dp[n][W];
        }
    }

    // tabulation
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incpro = v + dp[i - 1][j - w];
                    int exoPro = dp[i - 1][j];
                    dp[i][j] = Math.max(incpro, exoPro);
                } else {
                    int exoPro = dp[i - 1][j];
                    dp[i][j] = exoPro;
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        // Memoization
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }

        // System.out.println(knapsackMemo(val, wt, val.length, W, dp));
        System.out.println(knapsackTab(val, wt, W));
    }
}