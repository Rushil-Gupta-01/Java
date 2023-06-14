import java.util.Scanner;
public class Vowel_Consonant {
    public static void main(String[] args){
        System.out.println("Enter a vowel or a consonant: ");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        switch (character){
            //vowels
            case 'a', 'e', 'i', 'o', 'u' -> { System.out.println("=> " + character + " is a vowel.");}
            
            //consonants
            default -> System.out.println("=> " + character + " is a consonant.");
        }
    sc.close();
    }
}
