package org.example.Monsters1;

import java.util.Arrays;

public class ArraysSorting {

    public static void main(String[] args) {
        int[] array = {24, 1, 2, 3, 55, 66, 55, 64};

        Arrays.sort(array);

        System.out.println(array);
      //  System.out.println( Arrays.toString(array));


        System.out.println(Arrays.binarySearch(array, 50));

    }

}

