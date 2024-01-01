package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        //System.out.println(Arrays.toString(bs.bubbleSort(arr)));
        //System.out.println(Arrays.toString(bs.bubbleSortAndCheckSorted(arr)));

        InsertionSort is = new InsertionSort();
        //System.out.println(Arrays.toString(is.insertionSort(arr)));

        MergeSort merge = new MergeSort();
        System.out.println(Arrays.toString(merge.mergeSort(arr,0,n-1)));

    }
}
