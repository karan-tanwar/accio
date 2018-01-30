package com.accio.sorting;

public class Insertion {
    public void sort (int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = array[start];
        for (int i = 0; i <= start; i++) {
            if (temp < array[i]) {
                array[start] = array[i];
                array[i] = temp;
                temp = array[start];
            }
        }
        sort (array, start + 1, end);
    }
}
