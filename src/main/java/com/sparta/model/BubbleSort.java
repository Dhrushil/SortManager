package com.sparta.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements Sorter {

    public static Logger logger = LogManager.getLogger(BubbleSort.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {

        int tmp;
        try {
            for (int i = 0; i < arrayToSort.length-1; i++) {
                for (int j = 0; j < arrayToSort.length-1; j++) {
                    if (arrayToSort[j] > arrayToSort[j+1]) {
                        tmp = arrayToSort[j];
                        arrayToSort[j] = arrayToSort[j+1];
                        arrayToSort[j+1] = tmp;
                    }
                }
            }
        }catch (NullPointerException e) {
            logger.error(e.getMessage(),e);
        }
        catch (Exception e) {
            logger.error(e.getMessage(),e);
        }

        return arrayToSort;
    }
}
