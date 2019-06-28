package main.java.ArrayList;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ListSumAvg {

    public static void main(String[] args) {

        int[] a = {5, 3, -1, -7, 8, 9, 11};
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= 0) sum += a[i];
        }
        System.out.println("The sum is " + sum);

        OptionalDouble average = IntStream.of(a).average();

        System.out.println("The average is " + average);
    }


}

