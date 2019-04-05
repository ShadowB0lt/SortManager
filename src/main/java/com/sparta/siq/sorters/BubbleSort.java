package com.sparta.siq.sorters;

import java.util.Random;

public class BubbleSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort)
    {
        return getWhileBubbleSort(arrayToSort);
    }
/*
    public int[] getBubbleSort() {
        int[] sortTree = {12, 3, 7, 5, 8, 1};
        int tmp;
        for (int i = 0; i < sortTree.length; i++) {
            for (int j = 1; j < sortTree.length; j++) {
                if (sortTree[j - 1] > sortTree[j]) {
                    tmp = sortTree[j - 1];
                    sortTree[j - 1] = sortTree[j];
                    sortTree[j] = tmp;
                }
            }
        }
        return sortTree;
    }
*/

    private int[] getWhileBubbleSort(int[] sortTree) {
        int tmp;
        boolean sortable = true;
        while (sortable == true) {
            sortable = false;
            for (int i = 1; i < sortTree.length; i++) {
                if (sortTree[i - 1] > sortTree[i]) {
                    tmp = sortTree[i - 1];
                    sortTree[i - 1] = sortTree[i];
                    sortTree[i] = tmp;
                    sortable = true;
                }
            }
        }
        return sortTree;
    }

        public int getRandomValue (int range)
        {
            int randomValue = 0;
            Random rand = new Random();
            randomValue = rand.nextInt(range);
            return randomValue;
        }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}

