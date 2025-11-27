package com.suits.finder.sample;

public class Problem1 {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300, 375, 250, 400, 525, 600};
        int result = 0, n=responseTimes.length;
        for (int j=1; j<n; j++) {
            int sum = 0;
            for (int k=0; k<=j; k++) {
                sum += responseTimes[k];
            }
            int avg = sum/(j+1);
            for (int k=0; k<=j; k++) {
                if (responseTimes[k] > avg) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
