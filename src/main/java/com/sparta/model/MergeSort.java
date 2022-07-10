package com.sparta.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSort implements Sorter {
    public static Logger logger = LogManager.getLogger(MergeSort.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {


        return sort(arrayToSort, 0, arrayToSort.length-1);
    }

    private void mergeSort(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private int[] sort(int arr[], int l, int r)
    {
        try {
            if (l < r) {
                int m = l + (r-l)/2;

                sort(arr, l, m);
                sort(arr, m + 1, r);

                mergeSort(arr, l, m, r);
            }
        }catch (NullPointerException e) {
            logger.error(e.getMessage(), e);
        }
        catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return arr;
    }
}
