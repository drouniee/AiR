package ru.mirea.lab7.num4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number, double degree){
        return  Math.pow(number, degree);
    }

    @Override
    public double complexModule(double number, double imag){
        return Math.sqrt(number *  number + imag * imag);
    }

    public double circleLenght(double radius){
        return 2 * PI * radius;
    }

}
