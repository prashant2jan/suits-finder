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

public class Problem4 {
    static void main() {
        String s1 = "a";
        String s2 = "a";
        boolean result = s1.concat(s2)
                .chars()
                .filter(Character :: isLetter)
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .allMatch(count -> count % 2 == 0);

        System.out.println(result);
    }
}
