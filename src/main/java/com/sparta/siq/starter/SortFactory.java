package com.sparta.siq.starter;

import com.sparta.siq.sorters.BinaryTreeSorter;
import com.sparta.siq.sorters.BubbleSort;
import com.sparta.siq.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class SortFactory {

    enum sortTypes {
        BUBBLE("bubble"),
        MERGE("merge"),
        QUICK("quick"),
        TREE("tree");


        private String type;

        sortTypes(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    private SortFactory() {

    }

    public static Sorter getInstance() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("resources/factory.properties"));
            String sorter = properties.getProperty("sortType");
            Class selectedSorter = Class.forName(sorter);
            return (Sorter)selectedSorter.getDeclaredConstructor().newInstance();

            /* No longer need if statement because of statement in line 42
            if(sorter.equalsIgnoreCase(sortTypes.BUBBLE.type)) {
                return new BubbleSort();
            } else if (sorter.equalsIgnoreCase((sortTypes.MERGE.type))) {
                return new MergeSort();
            } else if (sorter.equalsIgnoreCase(sortTypes.QUICK.type)) {
                return new QuickSort();
            }
            */
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return new BinaryTreeSorter();
    }

}
