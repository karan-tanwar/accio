package com.accio.main;

import java.util.Scanner;

import com.accio.sorting.*;

public class IO {

    public void sortingOptions(Scanner scanner) {
        String option = "";
        while(option.equals("0") == false) {
            System.out.println("======================================");
            System.out.println("Data Input for sorting \nformat: \nfirst line: number of integers(0 for exit) \n next line :comma separated integers");
            System.out.println("======================================");
            int nInputs = scanner.nextInt();
            if (nInputs < 0) {
                return;
            }

            int inputList[] = new int[nInputs];
            for (int i = 0; i < nInputs; i++) {
                inputList[i] = scanner.nextInt();
            }


            System.out.println("=======Select Sorting Algo============");
            System.out.println("= 0. Exit                            =");
            System.out.println("= 1. Bubble                          =");
            System.out.println("= 2. Merge                           =");
            System.out.println("= 3. Insertion                       =");
            System.out.println("= 4. Selection                       =");
            System.out.println("= 5. Radix                           =");
            System.out.println("= 6. Quick                           =");
            System.out.println("======================================");
            option = scanner.next();
            switch(option) {
                case "1":
                    Bubble bubbleSort = new Bubble();
                    bubbleSort.sort(inputList, nInputs);
                    System.out.println("Starting bubble sort ");
                    break;
                case "2":

                    System.out.println("Starting Merge sort");
                    Merge mergeSort = new Merge();
                    mergeSort.sort(inputList, 0, nInputs - 1);
                    break;
                case "3":
                    System.out.println("Starting Insertion sort");
                    Insertion insertoinSort = new Insertion();
                    insertoinSort.sort(inputList, 0, nInputs);
                    break;
                case "4":
                    Selection selectionSort = new Selection();
                    selectionSort.sort(inputList, 0, nInputs);
                    System.out.println("Starting Selection sort");
                    break;
                case "5":
                    System.out.println("Starting Radix sort");
                    break;
                case "6":
                    Quick quickSort = new Quick();
                    quickSort.sort(inputList, 0, nInputs - 1);
                    System.out.println("Starting Quick sort");
                    break;
                default:
                    return;
            }

            for (int i = 0 ; i < nInputs; i++) {
                System.out.println(inputList[i]);

            }
        }

    }

    public void startIO() {
        String option = "";
        Scanner scanner = new Scanner(System.in);
        while (option.equals("0") == false) {
            System.out.println("======================================");
            System.out.println("= 0. Quit                            =");
            System.out.println("= 1. Searching                       =");
            System.out.println("= 2. sorting                         =");
            System.out.println("= 3. trees                           =");
            System.out.println("= 4. graphs                          =");
            System.out.println("======================================");
            option = scanner.next();
            switch(option ) {
                case "1":
                    System.out.println("Searching  Started");
                    break;
                case "2":
                    sortingOptions(scanner);
                    System.out.println("Sorting  Started");
                    break;
                case "3":
                    System.out.println("tree  Started");
                    break;
                case "4":
                    System.out.println("graphs  Started");
                    break;
                case "5":
                    System.out.println("test  Started");
                    break;
                default:
                    break;
            }

        }
    }
}
