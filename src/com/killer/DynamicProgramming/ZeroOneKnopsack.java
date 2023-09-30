package com.killer.DynamicProgramming;

import java.util.Arrays;

public class ZeroOneKnopsack {
    public static void main(String[] args) {

        int w = 10;
        int wt[] = {1,3,4,6};
        int val[] = {20,30,10,50};
        int n = wt.length;

        int dp[][] = new int[n+1][w+1];
//        Arrays.fill(dp,-1);
        for(int i=0;i<n+1;i++)
            for( int j=0;j<w+1;j++)
                dp[i][j] = -1;

        int ans = Knapsack(w,wt,val,n,dp);
        System.out.println(ans);
    }

    static int Knapsack(int w, int wt[],int val[], int n,int dp[][]){

        //base case
        if(n == 0 || w == 0)
            return 0;

        if(dp[n][w] != -1)
            return dp[n][w];

        //dynamic checking
        if(wt[n-1] > w)
            return dp[n][w] = Knapsack(w,wt,val,n-1,dp);
        else{
            return dp[n][w] = Math.max((val[n-1] + Knapsack(w-wt[n-1],wt,val,n-1,dp)),Knapsack(w,wt,val,n-1,dp));
        }
    }
}
