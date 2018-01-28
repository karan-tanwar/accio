package com.accio.sorting;

public class Merge {

    void merge( int[] array, int start, int pivot, int end) {
        int size1 = pivot - start + 1;
        int size2 = end - pivot;

        int lowerArray [] = new int[size1];
        int upperArray [] = new int[size2];
        for (int i = 0; i < size1; i++) {
            lowerArray[i] = array[start + i];
        }

        for (int i = 0; i < size2; i++) {
            upperArray[i] = array[pivot + 1 + i];
        }

        int i  = 0;
        int j = 0;
        for (int k = start; k <= end; k++) {
            if (i < size1 && j < size2) {
                if (lowerArray[i] <= upperArray[j]) {
                    array[k] = lowerArray[i++];
                } else {
                    array[k]  = upperArray[j++];
                }
            } else if (i < size1) {
                array[k] = lowerArray[i++];
            } else {
                array[k] = upperArray[j++];
            }
        }
    }

    public void sort(int[] inputList, int start, int end) {
        if (end <= start ) {
            return;
        }

        int pivot = (start + end) / 2;
        sort(inputList, start, pivot);
        sort(inputList, pivot + 1, end);
        merge(inputList, start, pivot, end);
    }
}
