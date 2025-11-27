package com.suits.finder.sample;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Result {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */

    public static void main(String[] args) {
        List<Integer> responseTimes = new ArrayList<>(Arrays.asList(100, 200, 150, 300, 375, 250, 400, 525, 600));
        int result = 0, n=responseTimes.size();
        for (int j=1; j<n; j++) {
            List<Integer> subList = responseTimes.subList(0, j+1);
            int avg = responseTimes.stream().mapToInt(s -> s).sum()/n;
            for (int item : subList) {
                if (item > avg) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}



