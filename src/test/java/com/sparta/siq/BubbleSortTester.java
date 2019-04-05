package com.sparta.siq;

import com.sparta.siq.sorters.BubbleSort;
import com.sparta.siq.sorters.Sorter;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTester {

    private Sorter sorter = new BubbleSort();

    @Test
    public void testAlreadySorted()
    {

    }

    @Test
    public void isSorted()
    {
        int[] unSorted = {3,1,7,5,2,8};
        int[] sorted = {1,2,3,5,7,8};
        int[] bubbleSorted = sorter.sortArray(unSorted);
        for (int i =1;i<bubbleSorted.length;i++)
        {
                Assert.assertFalse(bubbleSorted[i-1]>=bubbleSorted[i]);
        }
    }

    @Test
    public void testLength()
    {
        int[] unSorted = {3,1,7,5,2,8};
        int[] sorted = sorter.sortArray(unSorted);
        Assert.assertEquals(unSorted.length,sorted.length);
    }

    @Test
    public void testEmptyArray()
    {
        int[] unSorted = {};
        int[] sorted = sorter.sortArray(unSorted);
        Assert.assertTrue(sorted.length == 0);

    }

    @Test
    public void testDuplicates()
    {
        int[] unsorted = {3,1,7,5,2,8,5,8,3};
        int[] sorted = sorter.sortArray(unsorted);

        for(int i =1;i<sorted.length;i++)
        {
                //Assert.assertTrue(s);
        }
    }

    @Test
    public void testNegativeNumbers()
    {

    }

    @Test
    public void testZero()
    {
        int[] unsorted = {3,1,7,5,2,8,5,8,3};



    }

    @Test
    public void name()
    {

        //Check if it prints toString matches the bubble sort
    }




}
