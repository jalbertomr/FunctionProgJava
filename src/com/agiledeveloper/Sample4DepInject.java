package com.agiledeveloper;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Selector {
    public boolean pick(int value);
}

class EvenSelector implements Selector {
    public boolean pick(int value) {
        return value % 2 == 0;
    }
}
/**
 * Created by Bext on 18/02/2017.
 * Dependency Injection essencialy Strategy Pattern
 */
public class Sample4DepInject {

    public static int totalValues(List<Integer> list, Selector selector) {
        int result = 0;
        for (int e : list)
            if (selector.pick(e))
              result += e;
        return result;
    }

    public static int totalValuesB(List<Integer> list, Predicate<Integer> predicate){
        int result = 0;
        for ( int e: list)
            if ( predicate.test(e)) result += e;
        return result;
    }

    public static int totalValuesC( List<Integer> list, Predicate<Integer> predicate) {
        return list.stream()
                .filter(predicate)
                .reduce( 0, Math::addExact);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println( totalValues( list, e -> true) );  // result 55
        System.out.println( totalValues( list, e -> e % 2 == 0) );  // result 30
        System.out.println( totalValuesB( list, e -> true) );  // result 55
        System.out.println( totalValuesB( list, e -> e % 2 == 0) );  // result 30
        System.out.println( totalValuesC( list, e -> true));        // result 55
        System.out.println( totalValuesC( list, e -> e % 2 == 0));  // result 30
    }
}
