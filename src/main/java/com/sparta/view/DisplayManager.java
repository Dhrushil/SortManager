package com.sparta.view;

import com.sparta.model.Sorter;

import java.util.Arrays;

public class DisplayManager {

    public void printDetails(Sorter sorter, int[] array) {
        System.out.println("Your Sorted Array using: " + Arrays.toString(sorter.sortArray(array)));

    }
}
