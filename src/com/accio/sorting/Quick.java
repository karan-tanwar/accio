package com.accio.sorting;

public class Quick {
    int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int newPivotIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                newPivotIndex++;
                int temp = array[i];
                array[i] = array[newPivotIndex];
                array[newPivotIndex] = temp;
            }
        }

        newPivotIndex++;
        int temp = array[end];
        array[end] = array[newPivotIndex];
        array[newPivotIndex] = temp;

        return newPivotIndex;
    }

    public void sort (int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(array, start, end);

        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }
}
