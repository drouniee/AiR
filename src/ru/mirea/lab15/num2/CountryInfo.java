package ru.mirea.lab15.num2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryInfo extends JFrame {
    JComboBox<String> countryComboBox;
    JTextArea infoArea;

    public CountryInfo() {
        super("Информация о странах");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Австралия", "Канада", "Германия", "Япония", "Россия", "Бразилия"};
        countryComboBox = new JComboBox<>(countries);

        infoArea = new JTextArea(10, 30);
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(infoArea);

        add(new JLabel("Выберите страну:"));
        add(countryComboBox);
        add(scrollPane);

        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                displayCountryInfo(selectedCountry);
            }
        });

        displayCountryInfo("Австралия");

        setVisible(true);
    }

    private void displayCountryInfo(String country) {
        String info = "";
        switch(country) {
            case "Австралия":
                info = "Столица: Канберра\nНаселение: 26 млн человек\nОфициальный язык: Английский\nВалюта: Австралийский доллар (AUD)";
                break;
            case "Канада":
                info = "Столица: Оттава\nНаселение: 38 млн человек\nОфициальные языки: Английский, Французский\nВалюта: Канадский доллар (CAD)";
                break;
            case "Германия":
                info = "Столица: Берлин\nНаселение: 83 млн человек\nОфициальный язык: Немецкий\nВалюта: Евро (EUR)";
                break;
            case "Япония":
                info = "Столица: Токио\nНаселение: 126 млн человек\nОфициальный язык: Японский\nВалюта: Иена (JPY)";
                break;
            case "Россия":
                info = "Столица: Москва\nНаселение: 146 млн человек\nОфициальный язык: Русский\nВалюта: Российский рубль (RUB)";
                break;
            case "Бразилия":
                info = "Столица: Бразилиа\nНаселение: 213 млн человек\nОфициальный язык: Португальский\nВалюта: Бразильский реал (BRL)";
                break;
        }
        infoArea.setText("Информация о стране:\n\n" + info);
    }
}