package main.java.ArrayNumbers;

import java.util.ArrayList;

public class Days {

    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();
        days.add("One");
        days.add("Two");
        days.add("Tree");
        days.add("Four");
        System.out.println(days);
        days.set(days.indexOf("Tree"), "Three");
        System.out.println(days);
    }
}
