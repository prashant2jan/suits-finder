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

public class Problem3 {

    public static void main(String[] args) {
        String code = "A1b2B!a";
        String filteredCode = code.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        char[] arr = filteredCode.toCharArray();
        int size = arr.length;

        for (int i=1; i<=size/2; i++) {
            if (Character.toLowerCase(arr[i-1]) != Character.toLowerCase(arr[size-i])) {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}
