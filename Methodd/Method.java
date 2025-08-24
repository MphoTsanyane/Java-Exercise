package method;

public class Method {

    public static void main(String[] args) {
        int num1 = 29; // Example number for prime check
        int num2 = 5;  // Example number for factorial
        int a = 36, b = 60; // Example numbers for GCD
        String str = "madam"; // Example string to reverse
        int num3 = 121; // Example number to check palindrome

        // 1. Check if prime
        System.out.println(num1 + " is prime? " + isPrime(num1));

        // 2. Factorial
        System.out.println("Factorial of " + num2 + " is " + factorial(num2));

        // 3. GCD
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));

        // 4. Reverse string
        System.out.println("Reversed string of \"" + str + "\": " + reverseString(str));

        // 5. Check if number is palindrome
        System.out.println(num3 + " is palindrome? " + isPalindromeNumber(num3));
    }

    // Method to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // Method to calculate GCD
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // Method to reverse a string
    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Method to check if number is palindrome
    static boolean isPalindromeNumber(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
