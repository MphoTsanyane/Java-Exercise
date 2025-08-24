package strings;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // Example strings
        String str1 = "madam";       // For palindrome
        String str2 = "education";   // For vowel count
        String str3 = "hello world"; // For frequency and longest word
        String str4 = "listen";      // For anagram check
        String str5 = "silent";      // For anagram check

        // 1. Check if palindrome
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Is \"" + str1 + "\" a palindrome? " + str1.equals(reversed));

        // 2. Count vowels
        int vowelCount = 0;
        for (char c : str2.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowelCount++;
        }
        System.out.println("Number of vowels in \"" + str2 + "\": " + vowelCount);

        // 3. Frequency of characters
        int[] freq = new int[256]; 
        for (char c : str3.toCharArray()) freq[c]++;
        System.out.println("Character frequency in \"" + str3 + "\":");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) System.out.println((char)i + " : " + freq[i]);
        }

        // 4. Check if anagrams
        char[] arr1 = str4.toCharArray();
        char[] arr2 = str5.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("\"" + str4 + "\" and \"" + str5 + "\" are anagrams? " + Arrays.equals(arr1, arr2));

        // 5. Find the longest word in a sentence
        String[] words = str3.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest word in \"" + str3 + "\": " + longest);
    }
}
