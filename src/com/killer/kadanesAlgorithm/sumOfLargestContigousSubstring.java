package com.killer.kadanesAlgorithm;

public class sumOfLargestContigousSubstring {
    public static void main(String[] args) {

        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = a.length;
        System.out.println(LargestSum(a,n));
    }

    private static int LargestSum(int[] a, int n) {

        //initialiaze maxSum and currentSum
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        //loop to iterate array
        for(int i=0;i<n;i++){

            //add each element in the currentSum
            currentSum +=a[i];

            //if currentSum is greater than maxSum then assign current value to max value
            if(currentSum>maxSum)
                maxSum = currentSum;

            //if currentSum is less then zero then make it 0
            if(currentSum<0)
                currentSum = 0;
        }

        return maxSum;
    }
}
