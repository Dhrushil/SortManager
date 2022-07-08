package com.sparta.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSort implements Sorter {

    public static Logger logger = LogManager.getLogger(InsertionSort.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {
        try {
            int n = arrayToSort.length;
            for (int i = 1; i < n; ++i) {
                int key = arrayToSort[i];
                int j = i - 1;

                while (j >= 0 && arrayToSort[j] > key) {
                    arrayToSort[j + 1] = arrayToSort[j];
                    j = j - 1;
                }
                arrayToSort[j + 1] = key;
            }
        }catch (NullPointerException e) {
            logger.error(e.getMessage(),e);
        }catch (Exception e) {
            logger.error(e.getMessage(),e);
        }

        return arrayToSort;
    }

}
