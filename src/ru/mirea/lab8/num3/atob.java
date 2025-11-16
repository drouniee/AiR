package ru.mirea.lab8.num3;

public class atob {
    public static int recursion(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return 1;
        }
        else if (a > b){
            System.out.println(a);
            return recursion(a - 1, b);
            }
        else{
            System.out.println(a);
            return recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        recursion(12, 10);
    }
}