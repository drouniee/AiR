package ru.mirea.lab7.num7;

public class testMagazine {
    public static void main(String[] args) {
        Printable[] printables = {
            new Magazine("Чивапчичи"),
            new Magazine("Журнал"),
        };

        Magazine.printMagazine(printables);

    }

}
