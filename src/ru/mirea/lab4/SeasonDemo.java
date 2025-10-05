package ru.mirea.lab4;

public class SeasonDemo {
    public static void printFavoriteSeason(Season favorite) {
        System.out.println("Мое любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favorite.getDescription());
        System.out.println();
    }

    public static void printSeasonPreference(Season season) {
        System.out.print("Я люблю ");
        switch (season) {
            case WINTER:
                System.out.println("зиму");
                break;
            case SPRING:
                System.out.println("весну");
                break;
            case SUMMER:
                System.out.println("лето");
                break;
            case AUTUMN:
                System.out.println("осень");
                break;
        }
    }

    public static void printAllSeasons() {
        System.out.println("Все времена года");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        printFavoriteSeason(myFavoriteSeason);

        System.out.println("Предпочтения по временам года");
        printSeasonPreference(Season.SUMMER);
        printSeasonPreference(Season.WINTER);
        printSeasonPreference(Season.SPRING);
        printSeasonPreference(Season.AUTUMN);
        System.out.println();

        printAllSeasons();
    }
}