package reversenumber;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number of " + original + " is " + reversed);
    }
}
