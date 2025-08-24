package secondlargest;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 22, 89, 34};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
    }
}
