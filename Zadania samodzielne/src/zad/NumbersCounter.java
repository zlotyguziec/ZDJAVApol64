package zad;

import java.util.Scanner;

public class NumbersCounter {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę liczb:");
        int liczbaLiczb = scanner.nextInt();

        int suma = 0;

        for (int i = 0; i < liczbaLiczb; i++) {
            System.out.println("Podaj liczbę " + (i+1) + ":");
            suma += scanner.nextInt();
        }

        System.out.println("Suma liczb: " + suma);
        System.out.println("Srednia liczb: " + (float)(suma)/liczbaLiczb);

    }
}
