package pl.homework.lib;

public enum Season {
    SPRING ("wiosna", setMonthsOfSpring() ),
    SUMMER("lato", setMonthsOfSummer()),
    AUTUMN("jesień", setMonthsOfAutumn()),
    WINTER("zima", setMonthsOfWinter());

    private final String name;
    private final String[] months;


    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }

    private static String[] setMonthsOfSpring() {
        return new String[] {Month.MARCH.getNamePl(), Month.APRIL.getNamePl(), Month.MAY.getNamePl()};
    }

    private static String[] setMonthsOfSummer() {
        return new String[] {Month.JUNE.getNamePl(), Month.JULY.getNamePl(), Month.AUGUST.getNamePl()};
    }

    private static String[] setMonthsOfAutumn() {
        return new String[] {Month.SEPTEMBER.getNamePl(), Month.OCTOBER.getNamePl(), Month.NOVEMBER.getNamePl()};
    }
    private static String[] setMonthsOfWinter() {
        return new String[] {Month.DECEMBER.getNamePl(), Month.JANUARY.getNamePl(), Month.FEBRUARY.getNamePl()};
    }

    public static Season enumValueFromField(String field) throws IllegalSeasonException {
        for (Season season : values()) {
            if (season.getName().equalsIgnoreCase(field))
                return season;
        }
        throw new IllegalSeasonException("Nieprawidłowa nazwa pory roku - " + field);
    }
}
