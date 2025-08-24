package vowelconsonant;
public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'E'; // change to test

        ch = Character.toLowerCase(ch); 

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}



