package pl.homework.lib;

enum Month {
    JANUARY ("styczeń"),
    FEBRUARY("luty"),
    MARCH("marzec"),
    APRIL("kwiecień"),
    MAY ("maj"),
    JUNE("czerwiec"),
    JULY("lipiec"),
    AUGUST("sierpień"),
    SEPTEMBER("wrzesień"),
    OCTOBER("październik"),
    NOVEMBER("listopad"),
    DECEMBER("grudzień");

    public final String namePl;

    Month(String namePl) {
        this.namePl = namePl;
    }

    public String getNamePl() {
        return namePl;
    }
}
