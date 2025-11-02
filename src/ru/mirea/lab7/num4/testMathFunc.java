package ru.mirea.lab7.num4;

public class testMathFunc {
    public static void main(String[] args) {
        MathCalculable test = new MathFunc();
        MathFunc test2 = new MathFunc();

        System.out.println(test.pow(4, 2));
        System.out.println(test.pow(2, 10));

        System.out.println();
        System.out.println(test.complexModule(3, 4));
        System.out.println(test.complexModule(2, 2));


        System.out.println();
        System.out.println(MathFunc.PI);
        System.out.println(test2.circleLenght(3));
    }
}
