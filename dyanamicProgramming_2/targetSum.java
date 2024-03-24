package dyanamicProgramming_2;

import java.util.*;

public class targetSum {
    public static boolean tarsum(int number[], int tar) {
        boolean dp[][] = new boolean[number.length + 1][tar + 1];
        for (int i = 0; i < number.length + 1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < number.length + 1; i++) {
            for (int j = 1; j < tar + 1; j++) {
                int v = number[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[number.length][tar];
    }

    public static void main(String[] args) {
        int number[] = { 4, 2, 7, 1, 3 };
        int tar = 10;
        System.out.println(tarsum(number, tar));
    }
}
