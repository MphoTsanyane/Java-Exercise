package reversearray;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 22, 89, 34};

        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");

        System.out.print("\nReversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
