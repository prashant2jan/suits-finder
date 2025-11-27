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
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Problem2 {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {
        int[] arr = {1,1,0,-1,-1};
        double positive=0D, negative=0D, zero=0D, n=arr.length;
        for (int i : arr ) {
            if (i == 0) zero++;
            else if (i < 0) negative++;
            else positive++;
        }
        System.out.println(new BigDecimal(positive/n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(negative/n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(zero/n).setScale(6, RoundingMode.HALF_UP));
    }
}
