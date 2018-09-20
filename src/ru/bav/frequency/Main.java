package ru.bav.frequency;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = {2, 2, 1 ,12 ,2222, 6, 0, -1, 6, 6, 643, 543, 5, 34, 5, 34};

        int l = arr.length;
        int max = 0;
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = (array[i] > 0) ? array[i] : 0;
            for (int j = 0; j < l; j++) {
                if (arr[j] == arr[i]) {
                    array[i]++;
                    if (max < array[i]) max = array[i];
                }
            }
        }

        for (int m = max; m > 0; m--) {
            for (int i = 0; i < l; i++) {
                if (array[i] == m) {
                    System.out.println(arr[i] + " -> " + m);
                    if (m > 1) break;
                }
            }
        }
    }
}
