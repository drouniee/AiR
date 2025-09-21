package ru.mirea.lab1;

public class num7 {
    public static int fact(int a){
        int fct = 1;
        for (int i = 1; i <= a; i++){
            fct *= i;
        }
        return fct;
    }
    public static void main(String[] args) {
        int test = fact(10);
        System.out.print(test);
    }
}