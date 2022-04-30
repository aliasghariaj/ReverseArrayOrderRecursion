package com.aj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = null;
        try {
            lines = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] strs = lines.trim().split("\\s+");

        int[] array = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.parseInt(strs[i]);
        }

        int[] result = getReverse(array, 0, array.length);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    //Method that reverse the array order
    private static int[] getReverse(int a[], int start, int end) {
        if (start > end - 1) return a;
        int tmp = a[start];
        a[start] = a[end - 1];
        a[end - 1] = tmp;
        return getReverse(a, ++start, --end);
    }
}
