package ru.mirea.lab8.num15;

public class fig {
    public static int recursion(int n){if (n == 0){
        return 1;
    }
    else {
        System.out.print(n % 10);
        return recursion(n / 10);
    }
    }

    public static void main(String[] args) {
        recursion(10020030);
    }
}
