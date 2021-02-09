package zad;

import java.util.Scanner;

public class CalculateN {


    public static void main(String[] args) {

        System.out.println("Podaj liczbę N:");
        Scanner scanner = new Scanner(System.in);
        int liczbaN = scanner.nextInt();

        System.out.println(liczbaN + " + " + liczbaN + liczbaN + " + " + liczbaN + liczbaN + liczbaN + " = " + liczbaN*(1+11+111));
    }
}
