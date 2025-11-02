package ru.mirea.lab7.num5;

class ProcessStrings implements StringEditor{
    @Override
    public int countSymbols(String s){
        return s.length();
    }

    @Override
    public String getOddChars(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
