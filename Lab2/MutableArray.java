package ua.edu.ucu.apps.tasks;

import java.util.Arrays;

public class MutableArray {
    public static void mutate(int[] arr) {
        arr[0] = 1000;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        mutate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
