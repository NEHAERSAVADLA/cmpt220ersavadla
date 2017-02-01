
import java.util.Scanner;
import java.util.function.IntPredicate;
public class Vowelconsonant{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String value = input.next();
    input.close();

    boolean isVowel = value.chars().anyMatch(vowel);

    if (isVowel) {
        System.out.println(value + " is a vowel.");
    } else {
        System.out.println(value + " is a consonant.");
    }
}

static IntPredicate vowel = new IntPredicate() {
    @Override
    public boolean test(int t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
                || t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }
};
}