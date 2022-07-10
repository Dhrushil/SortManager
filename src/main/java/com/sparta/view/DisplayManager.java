package com.sparta.view;

import com.sparta.model.Sorter;

import java.util.Arrays;

public class DisplayManager {

    public void printDetails(Sorter sorter, int[] array) {
        long startTime = System.nanoTime();
        System.out.println("Your Sorted Array using: " + Arrays.toString(sorter.sortArray(array)));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for this sorting algorithm was " + estimatedTime + " nanoseconds");

    }
}
