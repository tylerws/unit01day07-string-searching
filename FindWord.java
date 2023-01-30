import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        
        System.out.println("Enter sentence/phrase");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println("Enter letter");
        String letter = scanner.nextLine();

        int letterPos = sentence.indexOf(letter, 0);
        if (letterPos >= 0) {
        String upToLetter = sentence.substring(0, letterPos);

        int spaceAfterPos = sentence.indexOf(" ", letterPos);
            if (spaceAfterPos < 0) {
                spaceAfterPos = sentence.length();
            }

        int spaceBeforePos = upToLetter.lastIndexOf(" ");
        if (spaceBeforePos < 0) {
            spaceBeforePos = 0;
        }
       
        String result = sentence.substring(spaceBeforePos, spaceAfterPos);
        System.out.println(result);
        scanner.close();
        } else {
            System.out.println("letter not in sentence");
            scanner.close();
        }


       

    }
}
