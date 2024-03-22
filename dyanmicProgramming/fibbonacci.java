package dyanmicProgramming;

import java.util.*;

public class fibbonacci {
    public static int fibbo(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;

        }

        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibbo(n - 1, f) + fibbo(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n=5;
        int f[]=new int[n+1];
        
        int fibbo=fibbo(n, f);
        System.out.println(fibbo);

    }

}