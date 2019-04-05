package com.sparta.siq.sorters;


import com.sparta.siq.BinarySearchTree.BinaryTree;
import com.sparta.siq.BinarySearchTree.Tree;

import java.util.List;


public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArray) {
        BinaryTree tree = new Tree();
        tree.addElements(unsortedArray);
        List<Integer> sortArray = tree.getSortedTreeAsc();
        int [] array = new int[sortArray.size()];
        for(int i = 0;i<array.length;i++)
        {
            array[i] = sortArray.get(i);
        }
       return array;
    }
}
