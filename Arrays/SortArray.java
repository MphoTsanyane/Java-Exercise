package sortarray;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 22, 89, 34};
        Arrays.sort(arr);

        System.out.print("Array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
