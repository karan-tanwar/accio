package com.accio.sorting;

public class Selection {
    public void sort (int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int min = array[start];
        int minIndex = start;
        for (int i = start; i < end; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }

        array[minIndex] = array[start];
        array[start] = min;
        sort(array, start + 1, end);
    }
}
