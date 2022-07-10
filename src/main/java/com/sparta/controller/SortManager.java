package com.sparta.controller;

import com.sparta.model.Sorter;
import com.sparta.view.DisplayManager;

public class SortManager {

    private Sorter model;
    private DisplayManager view;

    public SortManager(Sorter model, DisplayManager view) {
        this.model = model;
        this.view = view;
    }

    public void updateView(int[] unsortedArray) {
        view.printDetails(model, unsortedArray);
    }
}
