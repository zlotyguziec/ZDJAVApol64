package zad;

import java.util.Scanner;

public class HowManyChars {


    public static void main(String[] args) {

        int counter = 0;

        System.out.println("Podaj ciąg znaków:");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine().toLowerCase();

        System.out.println("Podaj szukany znak:");
        String znak = scanner.nextLine().toLowerCase();
        char znakJakoChar = znak.charAt(0);

        for (int i = 0; i < phrase.length(); i++) {
            if (znakJakoChar == phrase.charAt(i)) {

                counter++;
            }
        }

        System.out.println("Podany znak wystepuje " + counter + " razy.");
    }
}
