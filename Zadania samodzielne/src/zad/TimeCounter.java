package zad;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TimeCounter {


    public static void main(String[] args) {

        int totalSecondsIn24H = 86400;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj obecną godzinę w formacie 24H:");
        int hour = scanner.nextInt();
        System.out.println("Podaj obecną minutę:");
        int minutes = scanner.nextInt();
        System.out.println("Podaj obecne sekundy:");
        int seconds = scanner.nextInt();

        int secondsPassedAlready = hour*3600 + minutes*60 + seconds;
        System.out.println("Do północy pozostało: "  + (totalSecondsIn24H - secondsPassedAlready) + " sekund.");

        BigDecimal percentageOfPassedDay = BigDecimal.valueOf(100*(float)secondsPassedAlready/(float)totalSecondsIn24H).setScale(2, RoundingMode.CEILING);
        System.out.println("Minęło: " + percentageOfPassedDay + "% doby");

    }
}
