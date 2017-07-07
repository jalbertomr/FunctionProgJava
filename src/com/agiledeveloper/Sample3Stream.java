package com.agiledeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Bext on 18/02/2017.
 */
public class Sample3Stream {
    static Predicate<Integer> isGreatherThan3 = i -> i > 3;
    static Predicate<Integer> isEvenPredicate = i -> i % 2 == 0;
    static Function<Integer, Predicate<Integer>> isGreatherThan = x -> i -> i > x;

    public static boolean isGreatherThan(Integer i){
        System.out.println("isGreatherThan " + i);
      return i > 3;
    }

    public static boolean isEven(Integer i) {
        System.out.println("isEven " + i);
        return i % 2 == 0;
    }
    public static double doubleIt(Integer i) {
        System.out.println("doubleIt " + i);
        return i * 2;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println(
                list.stream()
                        //.filter( i -> i > 3)
                        //.filter( isGreatherThan3)
                        //.filter(Sample3Stream::isGreatherThan)
                        //.filter(e -> isGreatherThan(e))
                        .filter(isGreatherThan.apply(3))
                        //.filter(i -> i % 2 == 0)
                        //.filter(isEvenPredicate)
                        .filter(Sample3Stream::isEven)
                        //.map( i -> i * 2)
                        //.map(a -> doubleIt(a))
                        .map(Sample3Stream::doubleIt)
                        .findFirst()

        );
    }
}
