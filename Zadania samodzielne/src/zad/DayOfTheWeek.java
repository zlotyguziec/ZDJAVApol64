package zad;

import java.util.Scanner;

public class DayOfTheWeek {


    public static void main(String[] args) {

        System.out.println("Podaj rok:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println("Podaj miesiąc:");
        int month = scanner.nextInt();
        if (month == 1 || month == 2){
            year -= 1;
            month += 12;
        }

        System.out.println("Podaj dzień miesiąca:");
        int dayOfMonth = scanner.nextInt();

        int dayOfWeek = (dayOfMonth + 26*(month+1)/10 + year%100 + year%100/4 + year/100/4 + 5*year/100)%7;

        switch(dayOfWeek){
            case 0:
                System.out.println("Piątek");
                break;
            case 1:
                System.out.println("Sobota");
                break;
            case 2:
                System.out.println("Niedziela");
                break;
            case 3:
                System.out.println("Poniedziałek");
                break;
            case 4:
                System.out.println("Wtorek");
                break;
            case 5:
                System.out.println("środa");
                break;
            case 6:
                System.out.println("Czwartek");
                break;
        }

        //System.out.println(dayOfWeek);
    }
}
