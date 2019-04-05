package com.sparta.siq.starter;

import com.sparta.siq.sorters.Sorter;
import com.sparta.siq.view.DisplayManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Random;

public class SortManager {

    private DisplayManager display = new DisplayManager();
    private Logger log = Logger.getLogger(SortManager.class.getName());

    {
        PropertyConfigurator.configure("resources/log4j.properties");
    }

    public void sortArray() {

        log.trace("Sort Manager Started");

        int[] unsortedArray = generateArray(20);
        Sorter sorter = SortFactory.getInstance();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray.clone());
        long end = System.nanoTime();
        printUnsortedArray(unsortedArray);
        printSortedArray(sortedArray,sorter.toString(),end-start);
//       display.printUnSortedArray(unsortedArray);
//       display.printSortedArray(sortedArray, sorter.toString(),end-start);
    }

    private int[] generateArray(int size) {
        Random random = new Random();
        int[] unSortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            unSortedArray[i] = random.nextInt(size * 10) ;
        }
        return unSortedArray;
    }

    private void printUnsortedArray(int[] unSortedArray)
    {
        display.printUnSortedArray(unSortedArray);
    }

    private void printSortedArray(int[] sortedArray,String type,long time)
    {
        display.printSortedArray(sortedArray,type,time);
    }
}
