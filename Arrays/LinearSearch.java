package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 22, 89, 34};
        int target = 22;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println(target + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the array");
        }
    }
}
