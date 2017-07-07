package com.agiledeveloper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Bext on 18/02/2017.
 *   referential Transferencial doubleIt is a pure function always returns the same value at same input
 *   so its results can be internally replaced without process de function
 */
public class Sample4Stream {
    public static int doubleIt(int number) {
        //try { Thread.sleep(1000); } catch (InterruptedException ex) {}  //let do something else to the system
        return number * 2;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList( 0 , 1, 2, 3,4,5,6);
        IntStream streamInt = IntStream.range( 0 , 100);//.parallel();

        System.out.println(
        list.stream()

                .mapToInt(Sample4Stream::doubleIt)
                .sum()
        );
    }
}
