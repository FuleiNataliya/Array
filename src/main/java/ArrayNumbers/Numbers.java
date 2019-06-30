package main.java.ArrayNumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(9);
        number.add(11);
        number.add(18);
        number.add(20);
        number.add(22);
        number.removeIf(value -> value % 3 == 0);
        System.out.println(number);

    }
}




