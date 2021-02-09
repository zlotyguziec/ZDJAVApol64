package zad;

import java.util.Random;
import java.util.Scanner;

public class Lottery {


    public static void main(String[] args) {


        System.out.println("Podaj dwie cyfry (podając tylko jedną cyfrę N twój wybór będzie wyglądał następująco: 0N )");
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();

        Random random = new Random();

        boolean losowanie = true;
        do {

            int generatedNumber = random.nextInt(100);

            int firstUserNumber = numbers / 10;
            int secondUserNumber = numbers % 10;
            int firstGeneratedNumber = generatedNumber / 10;
            int secondGeneratedNumber = generatedNumber % 10;

            System.out.println("Wylosowana liczba: " + generatedNumber);

            if (numbers == generatedNumber) {
                System.out.println("Główna wygrana: 10 000$, gratulujemy");
                losowanie = false;
            } else if (secondUserNumber == firstGeneratedNumber && firstUserNumber == secondGeneratedNumber) {
                System.out.println("Wygrana 2 stopnia: 3 000$, gratulujemy");
                losowanie = false;
            } else if (firstUserNumber == firstGeneratedNumber || firstUserNumber == secondGeneratedNumber || secondUserNumber == firstGeneratedNumber || secondUserNumber == secondGeneratedNumber) {
                System.out.println("Wygrana 3 stopnia: 1 000$, gratulujemy");
                //losowanie = false;
            } else {
                System.out.println("Niestety, brak trafień. Spróbuj jeszcze raz");
            }

        } while (losowanie);
    }
}
