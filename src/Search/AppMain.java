package Search;

import java.util.Arrays;

public class AppMain {

    @SuppressWarnings("Duplicates")
    public static int binarySearch(int [] a, int x) {
        int p = 0;
        int r = a.length - 1;

        while (p <= r) {
            int q = (p+r)/2;
            if(x < a[q]) r = q-1;
            else if (x > a[q]) p = q+1;
            else return q; // we have found it!
        }
        return -1;
    }

    public static int recursiveLinearSearch(int [] arr, int i, int x) {
        if(i >= arr.length) {
            return -1;
        } else if(arr[i] == x) {
            return i;
        } else {
            System.out.println("index at: "+i);
            return recursiveLinearSearch(arr, i+1, x);
        }
    }
    @SuppressWarnings("Duplicates")
    public static int recursiveBinarySearch(int p, int r, int [] arr, int x) {

        int q = (p+r) / 2;

        if(p>r) {
            return -1;
        }
        else if(arr[q] > x) {
            return recursiveBinarySearch(p, q+1, arr, x);
        } else if(arr[q] < x) {
            return recursiveBinarySearch(q+1, r, arr, x);
        } else {
            return q;
        }
    }

//    public static String selectionSort(int [] arr) {
//        int min;
//
//        for(int i = 0; i< arr.length-1; i++) {
//            min=i;
//            for (int j = i+1; j< arr.length; j++) {
//                if(arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
//
//        return Arrays.toString(arr);
//    }

    @SuppressWarnings("Duplicates")
    public static String insertionSort(int [] arr) {

        for (int i=1; i<arr.length; i++) {
            int element = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >element) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
        return Arrays.toString(arr);
    }

    public static String bubbleSort(int [] arr) {

        int len = arr.length;

        // loop through all elements, first round, until n-2
        for(int k=0; k<len-2; k++) {

            // second round; we loop from the beginning until n-k-1
            for(int i=0; i<len-k-1; i++) {

                // compare and swap if condition sufficient
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }

        }

        return Arrays.toString(arr);

    }

    public static void main(String[] args) {
//        System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7,8,9}, 10));
//        int [] arr = {1,2,3,4,5,6,7,8,9};
//
//        System.out.println(recursiveBinarySearch(0, arr.length-1, arr, 10));

//        System.out.println(selectionSort(new int[]{25, 47, 3, 19, 8, 18}));
        System.out.println(insertionSort(new int[]{25, 47, 3, 19, 8, 18}));
        System.out.println(bubbleSort(new int[]{25, 47, 3, 19, 8, 18}));
    }
}






















