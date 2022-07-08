package com.sparta.factory;


import com.sparta.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.Scanner;

public class Start {

    public static Logger logger = LogManager.getLogger(Start.class);

    public Sorter makeSorter(int selection) {
        switch (selection) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            case 3:
                return new InsertionSort();
            case 4:
                return new TreeSort();
        }
        return null;
    }

    public int[] generateArray() {
        try {
            System.out.println("Enter Specified Length of array");
            Scanner arrSize = new Scanner(System.in);
            int arrLen = arrSize.nextInt();

            int[] unsortedArray = new int[arrLen];
            Random rand = new Random();
            for (int i = 0; i < unsortedArray.length; i++) {
                unsortedArray[i] = rand.nextInt(10);
            }
            return unsortedArray;
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;

    }
}
