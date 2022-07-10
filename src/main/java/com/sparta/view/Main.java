package com.sparta.view;

import com.sparta.controller.SortManager;
import com.sparta.model.Sorter;
import com.sparta.factory.Start;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true)
        {
            Start factory = new Start();
            int[] unsortedArray = factory.generateArray();
            System.out.println("Your Unsorted Random Array: " + Arrays.toString(unsortedArray));
            Scanner reader = new Scanner(System.in);
            System.out.println("Choose sorting algorithm.\n(1) Bubble Sort\n(2) Merge Sort\n(3) Insertion Sort\n(4) Tree Sort");
            int selection = reader.nextInt();
            Sorter model = factory.makeSorter(selection);
            DisplayManager view = new DisplayManager();
            SortManager controller = new SortManager(model, view);
            controller.updateView(unsortedArray);
            System.out.println("(1) Continue\n(2) Exit");
            selection = reader.nextInt();
            if (selection == 2) break;
        }
    }

}