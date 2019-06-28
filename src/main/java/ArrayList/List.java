package main.java.ArrayList;

import java.util.Arrays;

public class List {

    public static void main(String[] args) {

        int[] n = {2, 3, 1, 7, 11};
        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println((Arrays.toString(n)));
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }
}
