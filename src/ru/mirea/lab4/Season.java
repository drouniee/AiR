package ru.mirea.lab4;

public enum Season {
    WINTER(-15.5, "Холодное время года"),
    SPRING(8.2, "Холодное время года"),
    SUMMER(25.7, "Теплое время года"),
    AUTUMN(5.3, "Холодное время года");

    // Поля перечисления
    private final double averageTemperature;
    private String description;

    Season(double averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }
    public double getAverageTemperature() {
        return averageTemperature;
    }
    public String getDescription() {
        return description;
    }
}