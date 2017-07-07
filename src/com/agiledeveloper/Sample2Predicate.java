package com.agiledeveloper;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by Bext on 16/02/2017.
 *   Ctrl+Shift + T  Create unit test
 */
public class Sample2Predicate {
    public static void main(String[] args) {
        System.out.println(isPrimeFunctional(1));
        System.out.println(isPrimeFunctional(2));
        System.out.println(isPrimeFunctional(3));
        System.out.println(isPrimeFunctional(4));

    }

    public static boolean isPrimeIterative( final int number) {
        //imperative - saying how
        //mutability
        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return number > 1;
    }

    public static boolean isPrimeFunctional( final int number) {
        IntPredicate isDivisible = divisor -> number % divisor == 0;
        //Declarative  - focus on what we want
        //immutability
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch( isDivisible);
    }
}
