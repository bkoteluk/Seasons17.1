package pl.homework.app;

import pl.homework.lib.Season;
import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nazwę pory roku :");
        String seasonLabel = sc.nextLine();
        try {
            String[] months = getMonthsOfSeason(seasonLabel);
            for (String month : months) {
                System.out.print(month + " ");
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String[] getMonthsOfSeason(String seasonLabel) {
        Season season;
        if ((season = Season.enumValueFromField(seasonLabel)) != null) {
            return season.getMonths();
        } else
            throw new IllegalStateException("Nieprawidłowa nazwa pory roku - " + seasonLabel);
    }
}
