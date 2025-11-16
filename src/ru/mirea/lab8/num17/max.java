package ru.mirea.lab8.num17;
import java.util.Scanner;

public class max {
    public static int recursion(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        if (n == 0) {
            return 0;
        }
        int nextMax = recursion();
        return Math.max(n, nextMax);
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
