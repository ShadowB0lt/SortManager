package com.sparta.siq.sorters;

public class QuickSort implements Sorter{

    @Override
    public int[] sortArray(int[] unSortedArray)
    {
        return quickSort(unSortedArray,0,unSortedArray.length);
    }

    private int[] quickSort(int[] array,int low,int high)
    {
        int midPoint = high/2;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[high-midPoint];
        int i = 0;
       if(low<high)
       {
            int p = partition(array,low,high);

           /*
        //Split the array into 2 smaller Arrays
        for(int i =0;i< array.length;i++)
        {
            if(i<leftArray.length){
                leftArray[i] = array[i];
            }
            else if(i >= midPoint)
            {
                rightArray[i-midPoint] = array[i];
            }
        }
        */
       }
        return array;
    }

    private void splitArray()
    {

    }

    private int partition(int[] array,int lo,int hi)
    {
        int pivot = hi/2;

        for(int i = 0;i<array.length;i++) {
            if (array[pivot] < array[i]) {
                swap(array,i,pivot);
            }
            else if (array[pivot]>array[i])
            {
                swap(array,i,pivot);
            }
        }
        return pivot;

    }

    public void swap(int[] array,int i,int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public String toString() {
        return "QuickSorter";
    }
}
