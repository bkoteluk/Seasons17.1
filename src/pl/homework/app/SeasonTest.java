package pl.homework.app;

import pl.homework.lib.IllegalSeasonException;
import pl.homework.lib.Season;
import java.util.Scanner;

public class SeasonTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nazwę pory roku :");
        String seasonLabel = sc.nextLine();
        try {
            String[] months = getMonthsOfSeason(seasonLabel);
            System.out.print(seasonLabel + " to miesiące: ");
            for (String month : months) {
                System.out.print(month + " ");
            }
        } catch (IllegalSeasonException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static String[] getMonthsOfSeason(String seasonLabel) throws IllegalSeasonException {
        Season season = Season.enumValueFromField(seasonLabel);
        return season.getMonths();
    }
}
