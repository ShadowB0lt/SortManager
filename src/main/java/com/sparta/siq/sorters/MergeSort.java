package com.sparta.siq.sorters;

public class MergeSort implements Sorter{

    @Override
    public int[]sortArray(int[] arrayToSort)
    {
        return mergeSort(arrayToSort,arrayToSort.length);
    }

    private int[] mergeSort(int[] array,int size)
    {
        int midPoint = size/2;
        int[] lA = new int[midPoint];
        int[] rA = new int[size-midPoint];

        //Split the array into 2 smaller Arrays
        for(int i =0;i< array.length;i++)
        {
            if(i<lA.length){
                lA[i] = array[i];
            }
            else if(i >= midPoint)
            {
                rA[i-midPoint] = array[i];
            }
        }
//        printArray(lA,"Left Array = ");
//        printArray(rA,"Right Array = ");
        if(size<2){
            return array;
        }
        else {
            mergeSort(lA, midPoint);
            mergeSort(rA, size - midPoint);
            combine(array, lA, rA, midPoint, size - midPoint);
        }
        return array;
    }
    public void combine(int[]array, int[] lA, int[]rA, int lASize, int rASize)
    {
        int i = 0, j=0, k=0;
        boolean sortable = true;
        while(sortable==true){
            sortable = false;
            if(i<lASize && j<rASize)
            {
                if(lA[i]<=rA[j])
                {
                    array[k++] = lA[i++];
                    sortable = true;
                }
                else
                {
                    array[k++] = rA[j++];
                    sortable = true;
                }
            }
            else if(i<lASize)
            {
                array[k++] = lA[i++];
                sortable = true;
            }
            else if(j<rASize)
            {
                array[k++] = rA[j++];
                sortable = true;
            }
        }
    }

    public void printArray(int[] array,String string)
    {
        System.out.print(string);
        for (int i : array)
        {
            System.out.print(i + ", ");
        }
    }

    public void swap(int[]array,int i ,int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public String toString() {
        return "MergeSorter ";
    }
}
