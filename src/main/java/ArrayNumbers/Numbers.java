package main.java.ArrayNumbers;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(9);
        number.add(11);
        number.add(18);
        number.add(20);
        number.add(22);
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 3 == 0) iterator.remove();
        }
        System.out.println(number);

    }
}




