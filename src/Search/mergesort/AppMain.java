package Search.mergesort;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {

        int [] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};

        MergeSort sorter = new MergeSort();

        sorter.sort(inputArray);

        System.out.println(Arrays.toString(inputArray));

        MergeSort1 mergeSort = new MergeSort1();

        int arr[] = {5, 4, 3, 1, 9, 10};

        mergeSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
