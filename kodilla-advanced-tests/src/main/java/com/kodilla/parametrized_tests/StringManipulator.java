package com.kodilla.parametrized_tests;

import java.nio.charset.StandardCharsets;

public class StringManipulator {

    public String reverseWithLowerCase(String input) {          //METODA ODWRACAJACA KOLEJNOSC ZNAKOW(TEKST)
                                                                // I WYNIK ZWRACA W POSTACI MALYCH LITER

        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();      // zwrócenie obiektu, metoda reverse odrwaraca tekst,
                                                                // po czym zmienia go w stringa napisanego malymi literami
    }

    public int getStringLengthWithoutSpaces(String input) {       //METODA LICZACA ILOSC LITER W WYRAZIE, NIE UWZGLEDNIAJAC SPACE

       String value = input.replaceAll(" ", "");  //w zmiennej input wyklucza space
       return value.length();                                     //zwraca dlugosc stringa
    }

    public int countNumberOfCommas(String text) {                //METODA LICZACA LICZBE PRZECINKOW

        int count = text.length() - text.replace(",", "").length();
        return count;
    }

}
