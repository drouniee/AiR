package ru.mirea.lab14;

public class num7 {
    public static void main(String[] args) {
        String[] passwords = {"Dr0uniee_", "drouniee127", "qwerty", "11_lolkekK"};

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

        for (String password : passwords) {
            if (password.matches(regex)) {
                System.out.println(password + " - надежный пароль");
            } else {
                System.out.println(password + " - ненадежный пароль");
            }
        }
    }
}
