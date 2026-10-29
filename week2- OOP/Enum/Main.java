package Enum;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a day of the week : ");
        String reponse = scanner.nextLine().toUpperCase(); // toUpperCase thành chữ in hoa
        Day day = Day.valueOf(reponse);
        switch (day){
            case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("It is a weekDay");
            case SATURDAY, SUNDAY -> {
                System.out.println("It is a weekEnd");
                System.out.println("Get some rest");
            }
        }
        scanner.close();
    }
}
