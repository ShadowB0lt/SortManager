package com.sparta.siq.view;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DisplayManager {

    public void printUnSortedArray(int[] unSortedArray)
    {
        System.out.println("Unsorted Array: \n" + Arrays.toString(unSortedArray));
    }
    public void printSortedArray(int[] sortedArray, String sorter,long timeTaken)
    {
        DecimalFormat df = new DecimalFormat("###,###,###");
        System.out.println("Sorting using : " + sorter);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time taken = "+ df.format(timeTaken));
    }
}
