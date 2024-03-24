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

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(knapsackRec(val, wt, val.length, W));

    }
}
