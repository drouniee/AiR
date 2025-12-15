package ru.mirea.lab22;

public class CalculatorModel {
    private RPNCalculator calculator;
    private String displayValue;
    private String stackInfo;
    private boolean isResultDisplayed;

    public CalculatorModel() {
        calculator = new RPNCalculator();
        displayValue = "0";
        stackInfo = "Стек пуст";
        isResultDisplayed = false;
    }

    public void inputNumber(String number) {
        // Если это результат операции или ошибка — начинаем новое число
        if (isResultDisplayed || displayValue.equals("Ошибка")) {
            displayValue = number;
            isResultDisplayed = false;
        }
        // Если дисплей "0" и вводим "0" — ничего не делаем (нельзя "00")
        else if (displayValue.equals("0") && number.equals("0")) {
            // Ничего
        }
        // Если дисплей "0" и вводим НЕ "0" — заменяем "0" на число
        else if (displayValue.equals("0")) {
            displayValue = number;
        }
        // Все остальные случаи — добавляем цифру
        else {
            displayValue += number;
        }
        updateStackInfo();
    }

    public void enter() {
        try {
            if (!displayValue.equals("Ошибка")) {
                double value = Double.parseDouble(displayValue);
                calculator.push(value);
                displayValue = "0";
                isResultDisplayed = false;
                updateStackInfo();
            }
        } catch (NumberFormatException e) {
            displayValue = "Ошибка";
            isResultDisplayed = false;
        }
    }

    public void performOperation(String operator) {
        try {
            if (!displayValue.equals("0") && !isResultDisplayed && !displayValue.equals("Ошибка")) {
                enter();
            }

            calculator.performOperation(operator);
            displayValue = String.valueOf(calculator.peek());
            isResultDisplayed = true;
            updateStackInfo();

        } catch (Exception e) {
            displayValue = "Ошибка";
            isResultDisplayed = false;
            throw e;
        }
    }

    public void clear() {
        calculator.clear();
        displayValue = "0";
        isResultDisplayed = false;
        updateStackInfo();
    }

    public void clearEntry() {
        displayValue = "0";
        isResultDisplayed = false;
    }

    private void updateStackInfo() {
        if (calculator.isEmpty()) {
            stackInfo = "Стек пуст";
        } else {
            stackInfo = "Стек: " + calculator.getStackContents();
        }
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public String getStackInfo() {
        return stackInfo;
    }
}