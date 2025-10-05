package ru.mirea.lab3;

public class pg2ex1 {
    public static void main(String[] args) {

        // double через valueOf.
        Double num1 = Double.valueOf(1.234);
        Double num2 = Double.valueOf("6.4321");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        // String -> double.
        String strnum = "45.67";
        double primitiveDouble = Double.parseDouble(strnum);
        System.out.println(primitiveDouble);
        System.out.println();

        // Double ко всем примитивным.
        Double aaa = Double.valueOf(123.89);

        byte bytea = aaa.byteValue();
        short shorta = aaa.shortValue();
        int inta = aaa.intValue();
        long longa = aaa.longValue();
        float floata = aaa.floatValue();
        double doublea = aaa.doubleValue();

        System.out.println(aaa);
        System.out.println("byte: " + bytea);
        System.out.println("short: " + shorta);
        System.out.println("int: " + inta);
        System.out.println("long: " + longa);
        System.out.println("float: " + floata);
        System.out.println("double: " + doublea);
        System.out.println();

        // Double на консоль
        System.out.println(aaa);
        System.out.println(aaa.toString());
        System.out.println();

        // Литерал типа double к строке.
        String d = Double.toString(3.14);
        System.out.println("Литерал 3.14 преобразован в строку: " + d);
        System.out.println("Тип: " + d.getClass().getSimpleName());
    }
}